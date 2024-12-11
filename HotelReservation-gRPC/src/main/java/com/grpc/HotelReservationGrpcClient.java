package com.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.grpc.Reservation.ReservationRequest;
import com.grpc.Reservation.ReservationResponse;

public class HotelReservationGrpcClient {

    public static void main(String[] args) {
        String target = "localhost:9090";  // Use the port your server is running on

        // Create the channel to connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext() // Disable SSL/TLS for simplicity
                .build();

        // Create a stub for your service
        HotelReservationServiceGrpc.HotelReservationServiceBlockingStub stub =
                HotelReservationServiceGrpc.newBlockingStub(channel);

        // Build the request
        ReservationRequest request = ReservationRequest.newBuilder()
                .setCustomerName("John Doe")
                .setRoomType("Deluxe")
                .build();

        // Send the request and get the response
        ReservationResponse response = stub.createReservation(request);

        // Print the response
        System.out.println("Reservation Response: " + response.getStatus() + ", Reservation ID: " + response.getReservationId());

        // Shutdown the channel
        channel.shutdown();
    }
}
