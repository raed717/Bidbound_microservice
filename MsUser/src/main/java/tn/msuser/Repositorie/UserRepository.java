package tn.msuser.Repositorie;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.msuser.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
