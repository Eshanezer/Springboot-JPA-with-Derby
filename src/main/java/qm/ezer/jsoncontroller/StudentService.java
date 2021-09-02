package qm.ezer.jsoncontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qm.ezer.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<>();
		studentRepository.findAll().forEach(studentList::add);
		return studentList;
	}

	public Optional<Student> getById(String id) {
		//return students.stream().filter(s -> s.getId().equals(id)).findFirst().get();
		return studentRepository.findById(id);
	}

	public void add(Student student) {
		studentRepository.save(student);
	}

	public void update(Student student) {
		studentRepository.save(student);
	}

	public void delete(String id) {
		studentRepository.deleteById(id);
	}
}
