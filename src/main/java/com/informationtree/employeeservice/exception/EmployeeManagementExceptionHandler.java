package com.informationtree.employeeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeManagementExceptionHandler {

    @ExceptionHandler(value={EmployeeManagementNotFoundException.class})
    public ResponseEntity<Object> handleEmployeeManagementNotFoundException
            (EmployeeManagementNotFoundException employeeManagementNotFoundException)
    {
        EmployeeManagementException employeeManagementException = new EmployeeManagementException(
                employeeManagementNotFoundException.getMessage(),
                employeeManagementNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return  new ResponseEntity<>(employeeManagementException, HttpStatus.NOT_FOUND);
    }
}
