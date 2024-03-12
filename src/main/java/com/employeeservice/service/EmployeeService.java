package com.employeeservice.service;

import com.employeeservice.dto.EmployeeRequestDTO;
import com.employeeservice.dto.EmployeeResponseDTO;

import java.util.List;

public interface EmployeeService {

    void addEmployee(EmployeeRequestDTO requestDTO);

    void deleteEmployee(Long employeeId);

    void updateEmployee(Long id , EmployeeRequestDTO requestDTO);

    List<EmployeeResponseDTO> showAllEmployees();

    EmployeeResponseDTO getEmployeeById(Long Id);
}
