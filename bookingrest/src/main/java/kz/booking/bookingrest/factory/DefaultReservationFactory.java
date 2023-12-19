package kz.booking.bookingrest.factory;

import kz.booking.bookingrest.models.Reservation;

public class DefaultReservationFactory implements ReservationFactory {
    @Override
    public Reservation createReservation() {
        return new Reservation();
    }
}
