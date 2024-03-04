package com.owen4spring.restdemo01.rest;

import com.owen4spring.restdemo01.entity.Student;
import com.owen4spring.restdemo01.entity.StudentErrorResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import com.owen4spring.restdemo01.exception.StudentNotFoundException;


@RestController
@RequestMapping("/student-api")
public class StudentRestController {

    // define a private field list
    List<Student> studentList;

    // define PostConstruct method for to assign studentList after initializing.
    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<>();
        studentList.add(new Student(1,"AAA_last", "AAA_first"));
        studentList.add(new Student(11,"BBB_last", "BBB_first"));
        studentList.add(new Student(111,"CCC_last", "CCC_first"));
        studentList.add(new Student(1111,"DDD_last", "DDD_first"));
    }

    // define endpoint for "/students" to return a list of students
    @GetMapping("/student-list")
    public List<Student> getStudents(){
        return studentList;
    }

    // define endpoint for "/students/{studentId}" to return a student at index 'studentId'
    @GetMapping("/student-list/{studentIndex}")
    public Student getStudent(@PathVariable int studentIndex){

        return studentList.get(studentIndex);
    }

    // define endpoint for "/students/{studentId}" to raise an exception
    @GetMapping("/student-list-exception/{studentIndex}")
    public Student getStudentException(@PathVariable int studentIndex) throws StudentNotFoundException{
        if(studentIndex < 0 || studentIndex>= studentList.size()) {
            throw new StudentNotFoundException("Student not found: " + studentIndex);
        }
        return studentList.get(studentIndex);
    }

//    // Add exception handler by using @ExceptionHandler
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
//
//        StudentErrorResponse stuError = new StudentErrorResponse();
//        stuError.setStatus(HttpStatus.NOT_FOUND.value());
//        stuError.setMessage(exc.getMessage());
//        stuError.setTimeStamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(stuError, HttpStatus.NOT_FOUND);
//    }

//    // Add a generic exception handler by using @ExceptionHandler
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException2(Exception exc) {
//
//        StudentErrorResponse stuError = new StudentErrorResponse();
//        stuError.setStatus(HttpStatus.BAD_REQUEST.value());
//        stuError.setMessage(exc.getMessage());
//        stuError.setTimeStamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(stuError, HttpStatus.BAD_REQUEST);
//    }



}
