package tn.msuser.Repositorie;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.msuser.Entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
