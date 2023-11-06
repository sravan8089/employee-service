package com.informationtree.employeeservice.service.impl;

import com.informationtree.employeeservice.exception.EmployeeManagementNotFoundException;
import com.informationtree.employeeservice.model.EmployeeManagement;
import com.informationtree.employeeservice.repository.EmployeeManagementRepository;
import com.informationtree.employeeservice.service.EmployeeManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    EmployeeManagementRepository employeeManagementRepository;

    public EmployeeManagementServiceImpl(EmployeeManagementRepository employeeManagementRepository) {
        this.employeeManagementRepository = employeeManagementRepository;
    }


    @Override
    public String createEmployeeManagement(EmployeeManagement employeeManagement) {
        //More Business Logic here
        employeeManagementRepository.save(employeeManagement);
        return "Success";
    }

    @Override
    public String updateEmployeeManagement(EmployeeManagement employeeManagement) {
        //More Business logics here
        employeeManagementRepository.save(employeeManagement);
        return "Success";
    }

    @Override
    public String deleteEmployeeManagement(String employeeManagementId) {
        // More Business Logic here
        employeeManagementRepository.deleteById(employeeManagementId);
        return "Success";
    }

    @Override
    public EmployeeManagement getEmployeeManagement(String employeeManagementId) {
        // More Business Logic here
        if(employeeManagementRepository.findById(employeeManagementId).isEmpty())
            throw new EmployeeManagementNotFoundException("Requested Employee Management does not exist");
        return employeeManagementRepository.findById(employeeManagementId).get();
    }

    @Override
    public List<EmployeeManagement> getALLEmployeeManagements() {
        // More Business Logic here
        return employeeManagementRepository.findAll();
    }
}
