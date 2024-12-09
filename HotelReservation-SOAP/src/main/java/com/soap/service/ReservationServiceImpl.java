package com.soap.service;

import com.soap.entity.Reservation;
import com.soap.repository.ReservationRepository;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebService(endpointInterface = "com.soap.service.ReservationService")
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public String createReservation(String customerName, String description, String checkIn, String checkOut) {
        try {
            // Parse the check-in and check-out dates
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Reservation reservation = new Reservation();
            reservation.setCustomerName(customerName);
            reservation.setDescription(description);
            reservation.setCheckIn(sdf.parse(checkIn));
            reservation.setCheckOut(sdf.parse(checkOut));

            // Save the reservation to the database
            reservationRepository.save(reservation);

            return "Reservation created for " + customerName;
        } catch (ParseException e) {
            return "Error parsing dates: " + e.getMessage();
        }
    }

    @Override
    public String getReservation(Long id) {
        return "Reservation details for ID " + id;
    }

    @Override
    public List<String> getAllReservations() {
        return List.of("Reservation 1", "Reservation 2"); // Mock data, replace with repository logic
    }
}
