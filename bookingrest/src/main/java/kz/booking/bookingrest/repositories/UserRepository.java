package kz.booking.bookingrest.repositories;

import kz.booking.bookingrest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
