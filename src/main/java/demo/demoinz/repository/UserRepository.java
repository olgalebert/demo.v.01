package demo.demoinz.repository;

import demo.demoinz.model.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<AppUser, Long> {

    List<AppUser> findByUserName(String userName);
}
