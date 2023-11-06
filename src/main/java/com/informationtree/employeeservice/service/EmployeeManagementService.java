package com.informationtree.employeeservice.service;

import com.informationtree.employeeservice.model.EmployeeManagement;

import java.util.List;

public interface EmployeeManagementService {
    public String createEmployeeManagement(EmployeeManagement employeeManagement);
    public String updateEmployeeManagement(EmployeeManagement employeeManagement);
    public String deleteEmployeeManagement(String employeeManagementId);
    public EmployeeManagement getEmployeeManagement(String employeeManagementId);
    public List<EmployeeManagement> getALLEmployeeManagements();
}
