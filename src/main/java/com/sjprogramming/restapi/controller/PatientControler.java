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

import com.sjprogramming.restapi.entity.Patient;
import com.sjprogramming.restapi.repository.PatientRepository;

@RestController
public class PatientControler {

	@Autowired
	PatientRepository repo;

	/* obtiene todos los pacientes */
	@GetMapping("/patient")
	public List<Patient> getAllPatients() {
		List<Patient> patient = repo.findAll();
		return patient;
	}

	/* obtiene un paciente por su id */
	@GetMapping("/patient/{id}")
	public Patient getPatients(@PathVariable int id) {
		Patient patient = repo.findById(id).get();
		return patient;
	}

	/* crea paciente metodo post */
	@PostMapping("/patient/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createPatients(@RequestBody Patient patient) {
		repo.save(patient);
	}

	/* modifica al paciente metodo update */
	@PutMapping("/patient/update/{id}")
	public Patient updatePatients(@PathVariable int id, @RequestBody Patient updatePatient) {
		Patient patient = repo.findById(id).get();
		patient.setBranch(updatePatient.getBranch());
		patient.setName(updatePatient.getName());
		patient.setPorcentage(updatePatient.getPorcentage());
		repo.save(patient);
		return patient;
	}
/*borra paciente metodo update*/
	@DeleteMapping("/patient/delete/{id}")
	public void removePatient(@PathVariable int id) {
		Patient patient = repo.findById(id).get();
		repo.delete(patient);
	}

}
