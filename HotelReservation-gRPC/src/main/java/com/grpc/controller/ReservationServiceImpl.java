package com.grpc.controller;

import io.grpc.stub.StreamObserver;
import com.grpc.stubs.*;
import com.grpc.entity.Reservation; // JPA Entity
import com.grpc.repository.ReservationRepository; // JPA Repository
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@GrpcService
public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository; // Inject the repository

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void allReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        List<Reservation> reservations = reservationRepository.findAll(); // Fetch all from DB

        GetAllReservationsResponse.Builder responseBuilder = GetAllReservationsResponse.newBuilder();

        // Map database entities to Protobuf messages
        for (Reservation entity : reservations) {
            responseBuilder.addReservations(mapToProto(entity));
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void reservationById(GetReservationByIdRequest request, StreamObserver<GetReservationByIdResponse> responseObserver) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(Long.parseLong(request.getId()));

        if (optionalReservation.isPresent()) {
            // Map entity to Protobuf and send response
            Reservation reservation = optionalReservation.get();
            responseObserver.onNext(GetReservationByIdResponse.newBuilder()
                    .setReservation(mapToProto(reservation))
                    .build());
        } else {
            responseObserver.onError(new Throwable("Reservation not found"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveReservation(SaveReservationRequest request, StreamObserver<SaveReservationResponse> responseObserver) {
        ReservationRequest reservationReq = request.getReservation();

        try {
            // Map Protobuf request to JPA entity
            Reservation entity = new Reservation();
            entity.setCustomerName(reservationReq.getCustomerName());
            entity.setDescription(reservationReq.getDescription());
            entity.setCheckIn(dateFormat.parse(reservationReq.getCheckIn()));
            entity.setCheckOut(dateFormat.parse(reservationReq.getCheckOut()));

            // Save entity to the database
            Reservation savedEntity = reservationRepository.save(entity);

            // Map saved entity to Protobuf message
            responseObserver.onNext(SaveReservationResponse.newBuilder()
                    .setReservation(mapToProto(savedEntity))
                    .build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    /**
     * Utility method to map JPA entity to Protobuf message.
     */
    private com.grpc.stubs.Reservation mapToProto(Reservation entity) {
        return com.grpc.stubs.Reservation.newBuilder()
                .setId(String.valueOf(entity.getId()))
                .setCustomerName(entity.getCustomerName())
                .setDescription(entity.getDescription())
                .setCheckIn(dateFormat.format(entity.getCheckIn()))
                .setCheckOut(dateFormat.format(entity.getCheckOut()))
                .build();
    }
}
