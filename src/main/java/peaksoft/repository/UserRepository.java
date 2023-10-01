package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
