package com.sjprogramming.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjprogramming.restapi.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
