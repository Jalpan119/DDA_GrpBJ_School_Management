package com.dda.groupbj.schoolmanagement.controller;

import com.dda.groupbj.schoolmanagement.dao.ParentDao;
import com.dda.groupbj.schoolmanagement.dao.StudentDao;
import com.dda.groupbj.schoolmanagement.model.ParentModel;
import com.dda.groupbj.schoolmanagement.model.StudentModel;
import com.dda.groupbj.schoolmanagement.service.ParentService;
import com.dda.groupbj.schoolmanagement.service.StudentService;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class StudentDetailsController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ParentService parentService;

    @PostMapping(path="/saveStudent")
    public ResponseEntity<StudentModel> saveStudent(@RequestBody StudentDao student) {
        try {
            StudentDao studentObj = studentService.saveStudent(student);
            StudentModel resp = new StudentModel(studentObj.getStudentId(),
                    studentObj.getStudentName(), studentObj.getParent().getParentId());
            return new ResponseEntity<>(resp, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path="/allStudents")
    public @ResponseBody Iterable<StudentDao> getAllUsers() {
        return studentService.getAllStudents();
    }

    @GetMapping(path="/getStudent")
    public @ResponseBody ResponseEntity<StudentDao> getStudent(@RequestParam Integer studentId) {
        try {
            Optional<StudentDao> student = studentService.getStudentById(studentId);
            if (student.isPresent()) {
                log.info("Student: " + student);
                return new ResponseEntity<>(student.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path="/saveParent")
    public ResponseEntity<ParentModel> saveParent(@RequestBody ParentDao parent) {
        try {
            ParentDao parentObj = parentService.saveParent(parent);
            ParentModel resp = new ParentModel(parentObj.getParentId(),
                    parentObj.getParentName());
            return new ResponseEntity<>(resp, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path="/getParent")
    public @ResponseBody ResponseEntity<ParentDao> getParent(@RequestParam Integer parentId) {
        try {
            Optional<ParentDao> parent = parentService.getParentById(parentId);
            if (parent.isPresent()) {
                log.info("Parent: " + parent);
                return new ResponseEntity<>(parent.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
