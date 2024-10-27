package com.sjprogramming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "Patient")
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)/*CREA AUTOMATICAMENTE EL NUMERO DE LISTA*/

	private int rollNo;
@Column(name = "patient_name")/*solo nom del paciente*/
	private String name;
@Column(name = "patient_appointment")
	private Date appointment;
@Column(name = "patient_doctor")
	private String doctor ;
public Patient() {
	
}

public Patient(String name, Date appointment, String doctor) {
	super();
	this.name = name;
	this.appointment = appointment;
	this.doctor = doctor;
}

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getAppointment() {
	return appointment;
}
public void setAppointment(Date appointment) {
	this.appointment = appointment;
}
public String getDoctor() {
	return doctor;
}
public void setDoctor(String doctor) {
	this.doctor = doctor;
}
@Override
public String toString() {
	return "Patient [rollNo=" + rollNo + ", Name=" + name + ", Appointment=" + appointment + ", Doctor=" + doctor + "]";
}

}
