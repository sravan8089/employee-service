package com.informationtree.employeeservice.controller;


import com.informationtree.employeeservice.model.EmployeeManagement;
import com.informationtree.employeeservice.response.ResponseHandler;
import com.informationtree.employeeservice.service.EmployeeManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeemanagement")
public class EmployeeManagementController {


    EmployeeManagementService employeeManagementService;

    public EmployeeManagementController(EmployeeManagementService employeeManagementService) {
        this.employeeManagementService = employeeManagementService;
    }

    // Read Specific Employee Management Details from DB
    @GetMapping("{employeeId}")
    public ResponseEntity<Object> getEmployeeManagementDetails(@PathVariable("employeeId") String employeeId){

        return ResponseHandler.responseBuilder( "Requested Employee Details are give here",
                HttpStatus.OK, employeeManagementService.getEmployeeManagement(employeeId));

        //return  new EmployeeManagement("C1100", "James Reek", "Business Analyst", "$70000");

    }

    // Read All Employee Management Details in Data base
    @GetMapping()
    public List<EmployeeManagement> getAllEmployeeManagementDetails(){

        return employeeManagementService.getALLEmployeeManagements();

        //return  new EmployeeManagement("C1100", "James Reek", "Business Analyst", "$70000");

    }

    @PostMapping
    public String createEmployeeManagementDetails(@RequestBody EmployeeManagement employeeManagement){

        employeeManagementService.createEmployeeManagement(employeeManagement);
        return "Employee Management Application Created Successfully";

    }
    @PutMapping
    public String updateEmployeeManagementDetails(@RequestBody EmployeeManagement employeeManagement){

        employeeManagementService.updateEmployeeManagement(employeeManagement);
        return "Employee Management Application Updated Successfully";

    }

    @DeleteMapping("{employeeId}")
    public String deleteEmployeeManagementDetails(@PathVariable("employeeId") String employeeId){

        employeeManagementService.deleteEmployeeManagement(employeeId);
        return "Employee Management Application Deleted Successfully";

    }



}
