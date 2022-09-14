package user.com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import user.com.Model.UserReg;

@Repository

public interface UserRepo extends JpaRepository<UserReg, String> {
	List<UserReg> findByFirstName(String firstName);

	List<UserReg> findByEmail(String email);

}
