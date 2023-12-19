package kz.booking.bookingrest.repositories;

import kz.booking.bookingrest.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    List<Restaurant> findByName(String name);
}
