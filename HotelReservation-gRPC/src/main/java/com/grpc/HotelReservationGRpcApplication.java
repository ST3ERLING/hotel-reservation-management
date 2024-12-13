package com.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HotelReservationGRpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReservationGRpcApplication.class, args);
	}
}
