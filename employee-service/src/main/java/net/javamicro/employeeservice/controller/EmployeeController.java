package net.javamicro.employeeservice.controller;

import lombok.AllArgsConstructor;
import net.javamicro.employeeservice.dto.EmployeeDto;
import net.javamicro.employeeservice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee (@RequestBody EmployeeDto employeeDto){
    EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
