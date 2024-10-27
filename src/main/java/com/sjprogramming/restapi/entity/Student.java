package com.sjprogramming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)/*CREA AUTOMATICAMENTE EL NUMERO DE LISTA*/

	private int rollNo;
@Column(name = "student_name")/*solo nom del student*/
	private String name;
@Column(name = "student_porcentage")
	private float porcentage;
@Column(name = "student_branch")
	private String branch;
public Student() {
	
}

public Student(String name, float porcentage, String branch) {
	super();
	this.name = name;
	this.porcentage = porcentage;
	this.branch = branch;
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
public float getPorcentage() {
	return porcentage;
}
public void setPorcentage(float porcentage) {
	this.porcentage = porcentage;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", porcentage=" + porcentage + ", branch=" + branch + "]";
}

}
