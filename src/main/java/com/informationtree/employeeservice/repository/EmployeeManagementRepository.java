package com.informationtree.employeeservice.repository;

import com.informationtree.employeeservice.model.EmployeeManagement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeManagementRepository extends JpaRepository<EmployeeManagement, String> {
     List<EmployeeManagement> findByEmployeeName (String employeeName);
    }
