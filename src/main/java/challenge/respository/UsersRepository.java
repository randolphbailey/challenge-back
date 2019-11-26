package challenge.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import challenge.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	Users findByUsername(String username);
}
