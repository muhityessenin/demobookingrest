package kz.booking.bookingrest.repositories;

import kz.booking.bookingrest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoggingRepository extends JpaRepository<User, String> {
    User findByUsernameAndPassword(String username, String password);
}
