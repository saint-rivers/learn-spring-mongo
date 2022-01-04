package com.saintrivers.learn.controller;

import com.saintrivers.learn.model.Address;
import com.saintrivers.learn.model.Gender;
import com.saintrivers.learn.model.Student;
import com.saintrivers.learn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String insertDefaultStudent(){
        Address address = new Address("England", "123123", "Nottingham");
        Student student = new Student(
                "Jamila",
                "Hay",
                "j@gmail.com",
                Gender.FEMALE,
                address,
                List.of("python"),
                LocalDateTime.now()
        );

        boolean result = studentService.insert(student);
        return (result) ? "success": "failed";
    }
}
