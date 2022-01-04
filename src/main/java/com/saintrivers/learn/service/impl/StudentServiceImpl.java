package com.saintrivers.learn.service.impl;

import com.saintrivers.learn.model.Student;
import com.saintrivers.learn.repository.StudentRepository;
import com.saintrivers.learn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean insert(Student student) {
        Student s = studentRepository.insert(student);
        return true;
    }
}
