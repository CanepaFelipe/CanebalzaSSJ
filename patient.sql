CREATE DATABASE patientdatabase; 
USE patientdatabase; 

CREATE TABLE patient(
    roll_no INT AUTO_INCREMENT PRIMARY KEY,
    patient_appointment DATE,
    patient_doctor VARCHAR(255),
    patient_name VARCHAR(255)
);