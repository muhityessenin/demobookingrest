package kz.booking.bookingrest.repositories;

import kz.booking.bookingrest.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
