package com.dda.groupbj.schoolmanagement.service;

import com.dda.groupbj.schoolmanagement.dao.StudentDao;
import com.dda.groupbj.schoolmanagement.repository.StudentRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public Iterable<StudentDao> getAllStudents() {
        return repo.findAll();
    }

    public Optional<StudentDao> getStudentById(Integer studentId) {
        return repo.findById(studentId);
    }

    public StudentDao saveStudent(StudentDao student) {
        return repo.save(student);
    }
}
