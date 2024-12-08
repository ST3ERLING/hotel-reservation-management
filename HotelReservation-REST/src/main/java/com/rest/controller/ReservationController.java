package com.rest.controller;

import com.rest.entity.Reservation;
import com.rest.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    ReservationRepository reservationRepository;

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation) {
        System.out.println("Received Reservation: " + reservation);
        return reservationRepository.save(reservation);
    }
    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable Long id , @RequestBody Reservation reservation) {
        // Fetch the existing reservation
        Reservation oldReservation = reservationRepository.findById(id).orElse(null);

        if (oldReservation == null) {
            throw new RuntimeException("Reservation with ID " + reservation.getId() + " not found.");
        }

        // Update only the fields provided in the request
        if (reservation.getCustomerName() != null) {
            oldReservation.setCustomerName(reservation.getCustomerName());
        }
        if (reservation.getDescription() != null) {
            oldReservation.setDescription(reservation.getDescription());
        }
        if (reservation.getCheckIn() != null) {
            oldReservation.setCheckIn(reservation.getCheckIn());
        }
        if (reservation.getCheckOut() != null) {
            oldReservation.setCheckOut(reservation.getCheckOut());
        }

        // Save the updated reservation
        return reservationRepository.save(oldReservation);
    }

    @DeleteMapping
    public void deleteReservation(@RequestBody Reservation reservation) {
        reservationRepository.delete(reservation);
    }
}
