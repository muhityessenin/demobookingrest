package kz.booking.bookingrest.services;

import kz.booking.bookingrest.models.User;
import kz.booking.bookingrest.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
   private final UserRepository userRepository;
   public void createUser(User user){
       userRepository.save(user);
   }
   public void removeUser(Long user_id){
       userRepository.deleteById(user_id);
   }
}
