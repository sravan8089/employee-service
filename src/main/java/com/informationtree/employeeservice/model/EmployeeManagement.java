package com.informationtree.employeeservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_management_info")
public class EmployeeManagement {


    @Id
    private String EmployeeId;
    private String EmployeeName;
    private String EmployeePosition;
    private String EmployeeSalary;

    public EmployeeManagement() {
    }

    public EmployeeManagement(String employeeId, String employeeName, String employeePosition, String employeeSalary) {
        this.EmployeeId = employeeId;
        this.EmployeeName = employeeName;
        this.EmployeePosition = employeePosition;
        this.EmployeeSalary = employeeSalary;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
       this.EmployeeName = employeeName;
    }

    public String getEmployeePosition() {
        return EmployeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
      this.EmployeePosition = employeePosition;
    }

    public String getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.EmployeeSalary = employeeSalary;
    }

}
