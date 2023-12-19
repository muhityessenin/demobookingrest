package kz.booking.bookingrest.controllers;

import kz.booking.bookingrest.models.Reservation;
import kz.booking.bookingrest.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;
    @GetMapping("/mybookings/")
    public String getAllBookings(@RequestParam(name = "name", required = false) String name, Model model){
        model.addAttribute("reservation", reservationService.getAllBookings(name));
        return "bookings";
    }
    @GetMapping("/reservation/{reservation_id}")
    public String bookingInfo(@PathVariable Long reservation_id, Model model){
        Reservation reservation = reservationService.getBookingByID(reservation_id);
        model.addAttribute("reservation",reservation);
        return "reservation-info";
    }
    @PostMapping("/reservation/reserve")
    public String addBooking(Reservation reservation){
        reservationService.addBooking(reservation);
        return "home";
    }
    @PostMapping("/reservation/cancel")
    public String cancelBooking(Long id){
        reservationService.cancelBooking(id);
        return "home";
    }
}
