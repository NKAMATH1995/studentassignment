package studentmanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentmanagement.model.Student;
@Repository
public interface StudentDao extends JpaRepository<Student,Long> {

	

	

}
