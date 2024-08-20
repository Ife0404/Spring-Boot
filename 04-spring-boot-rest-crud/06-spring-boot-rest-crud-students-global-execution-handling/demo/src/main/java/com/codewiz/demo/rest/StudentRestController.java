package com.codewiz.demo.rest;


import com.codewiz.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;


    @PostConstruct
    public void loadData() {

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Danielle", "Jane"));
        theStudents.add(new Student("Mario", "Ballotelli"));
        theStudents.add(new Student("Mary", "Oliver"));

    }

    // define endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    // define endpoint or "/students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // just index into the list ... keep it simple for now

        // check the studentId against list size

        if ((studentId >= theStudents.size()) || (studentId < 0)) {

            throw new StudentNotFoundException("Student ID not found - " + studentId);

        }

        return theStudents.get(studentId);
    }

}
