package challenge.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import challenge.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
