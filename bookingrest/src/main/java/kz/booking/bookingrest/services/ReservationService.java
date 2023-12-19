package kz.booking.bookingrest.services;

import kz.booking.bookingrest.models.Reservation;
import kz.booking.bookingrest.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationService {
    private final ReservationRepository reservationRepository;
    public List<Reservation> getAllBookings(String name){
        return reservationRepository.findAll();
    }
    public void addBooking(Reservation reservation){
        reservationRepository.save(reservation);
    }

    public void cancelBooking(Long id){
        reservationRepository.deleteById(id);
    }

    public Reservation getBookingByID(Long id){
        return reservationRepository.findById(id).orElse(null);
    }

}
