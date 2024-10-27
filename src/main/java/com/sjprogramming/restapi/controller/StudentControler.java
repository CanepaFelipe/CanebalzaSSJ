package com.sjprogramming.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sjprogramming.restapi.entity.Student;
import com.sjprogramming.restapi.repository.StudentRepository;

@RestController
public class StudentControler {

	@Autowired
	StudentRepository repo;

	/* obtiene todos los estudiantes */
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		List<Student> students = repo.findAll();
		return students;
	}

	/* obtiene un estudiante por su id */
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		return student;
	}

	/* crea estudiante metodo post */
	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}

	/* modifica al estudiante metodo update */
	@PutMapping("/student/update/{id}")
	public Student updateStudents(@PathVariable int id, @RequestBody Student updateStudent) {
		Student student = repo.findById(id).get();
		student.setBranch(updateStudent.getBranch());
		student.setName(updateStudent.getName());
		student.setPorcentage(updateStudent.getPorcentage());
		repo.save(student);
		return student;
	}
/*borra alumno metodo update*/
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}

}
