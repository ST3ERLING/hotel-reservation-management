package com.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class HotelReservationGRpcApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Create and start the gRPC server
		int port = 9090; // Choose a port for the server
		Server server = ServerBuilder.forPort(port)
				.addService(new HotelReservationServiceImpl())  // Register the service implementation
				.build();

		System.out.println("Server started, listening on " + port);
		server.start();

		// Block the main thread and keep the server running
		server.awaitTermination();
	}
}
