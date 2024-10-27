CREATE DATABASE studentdatabase; 
USE studentdatabase; 

CREATE TABLE student(
    roll_no INT AUTO_INCREMENT PRIMARY KEY,
    student_porcentage FLOAT,
    student_branch VARCHAR(255),
    student_name VARCHAR(255)
);