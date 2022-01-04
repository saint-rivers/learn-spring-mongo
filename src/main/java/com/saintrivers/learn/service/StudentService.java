package com.saintrivers.learn.service;

import com.saintrivers.learn.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    boolean insert(Student student);
}
