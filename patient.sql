CREATE DATABASE patientdatabase; 
USE patientdatabase; 

CREATE TABLE patient(
    roll_no INT AUTO_INCREMENT PRIMARY KEY,
    patient_porcentage FLOAT,
    patient_branch VARCHAR(255),
    patient_name VARCHAR(255)
);