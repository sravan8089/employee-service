package com.informationtree.employeeservice.exception;

public class EmployeeManagementNotFoundException extends RuntimeException{


    public EmployeeManagementNotFoundException(String message) {
        super(message);
    }

    public EmployeeManagementNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
