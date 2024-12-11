package com.grpc;

import io.grpc.stub.StreamObserver;
import com.grpc.Reservation.ReservationRequest;
import com.grpc.Reservation.ReservationResponse;

public class HotelReservationServiceImpl extends HotelReservationServiceGrpc.HotelReservationServiceImplBase {

    @Override
    public void createReservation(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        // Business logic to handle reservation
        ReservationResponse response = ReservationResponse.newBuilder()
                .setStatus("Success")         // Set the status
                .setReservationId("12345")    // Set the reservation ID
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Implement other service methods such as checking availability, cancelling reservation, etc.
}

