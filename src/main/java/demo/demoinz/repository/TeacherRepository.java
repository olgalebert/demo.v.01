package demo.demoinz.repository;

import demo.demoinz.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface  TeacherRepository extends JpaRepository<Teacher, Long> {


    Teacher findByUserName(String username);
}
