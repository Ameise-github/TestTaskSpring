package testSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testSpring.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
}
