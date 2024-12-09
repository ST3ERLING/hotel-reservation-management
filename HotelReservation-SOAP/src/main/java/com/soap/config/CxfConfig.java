package com.soap.config;

import com.soap.service.ReservationServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    private final Bus bus;
    private final ReservationServiceImpl reservationService;

    public CxfConfig(Bus bus, ReservationServiceImpl reservationService) {
        this.bus = bus;
        this.reservationService = reservationService;
    }

    @Bean
    public Endpoint reservationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationService);
        endpoint.publish("/reservation");
        return endpoint;
    }
}
