package studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studentmanagement.dao.StudentDao;
import studentmanagement.model.Student;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	@GetMapping("/students")
    public List<Student>getALLStudents() {
		return studentDao.findAll();
		
	}
	@GetMapping("/students/{id}")
	public Student getStudentsId(@PathVariable Long id) {
		return studentDao.findById(id).get();
	}
	
	@PostMapping("/students")
	public Student saveStudentDetails(@RequestBody Student student) {
	return studentDao.save(student);
}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return studentDao.save(student);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<HttpStatus>deleteStudentsById(@PathVariable Long id) {
		studentDao.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
