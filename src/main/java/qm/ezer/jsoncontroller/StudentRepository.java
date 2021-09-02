package qm.ezer.jsoncontroller;

import org.springframework.data.repository.CrudRepository;

import qm.ezer.model.Student;

public interface StudentRepository extends CrudRepository<Student,String>{
	
}	
