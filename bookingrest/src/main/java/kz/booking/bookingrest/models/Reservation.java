package kz.booking.bookingrest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Entity
@Table(name = "reservation")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservation {
    @Id
    @Column(name = "reservation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservation_id;
    @Column(name = "restaurant_id")
    private Long restaurant_id;
    @Column(name = "user_id")
    private Long user;
    @Column(name = "reservation_date")
    private LocalDateTime reservationDateTime;
    @Column(name = "people")
    private int people_for_reservation;
}
