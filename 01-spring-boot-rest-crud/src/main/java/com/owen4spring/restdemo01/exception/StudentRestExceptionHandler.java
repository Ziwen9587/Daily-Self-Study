package com.owen4spring.restdemo01.exception;

import com.owen4spring.restdemo01.entity.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    // Add exception handler by using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {

        StudentErrorResponse stuError = new StudentErrorResponse();
        stuError.setStatus(HttpStatus.NOT_FOUND.value());
        stuError.setMessage(exc.getMessage() + " From Global StudentRestExceptionHandler");
        stuError.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(stuError, HttpStatus.NOT_FOUND);
    }

    // Add a generic exception handler by using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleGlobalException(Exception exc) {

        StudentErrorResponse stuError = new StudentErrorResponse();
        stuError.setStatus(HttpStatus.BAD_REQUEST.value());
        stuError.setMessage(exc.getMessage()+ " From Global StudentRestExceptionHandler");
        stuError.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(stuError, HttpStatus.BAD_REQUEST);
    }
}
