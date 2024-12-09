package com.soap.service;

import com.soap.entity.Reservation;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface ReservationService {

    @WebMethod
    String createReservation(String customerName, String description, String checkIn, String checkOut);

    @WebMethod
    String getReservation(Long id);

    @WebMethod
    List<Reservation> getAllReservations();
}
