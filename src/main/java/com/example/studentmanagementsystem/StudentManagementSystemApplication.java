package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements StudentManagementSystemApplications {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
