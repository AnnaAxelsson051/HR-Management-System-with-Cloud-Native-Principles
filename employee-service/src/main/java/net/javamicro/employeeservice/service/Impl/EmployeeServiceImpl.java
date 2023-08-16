package net.javamicro.employeeservice.service.Impl;

import lombok.AllArgsConstructor;
import net.javamicro.employeeservice.dto.EmployeeDto;
import net.javamicro.employeeservice.entity.Employee;
import net.javamicro.employeeservice.repository.EmployeeRepository;
import net.javamicro.employeeservice.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    //Saving new employee info
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
        employeeDto.getId(),
        employeeDto.getFirstName(),
        employeeDto.getLastName(),
        employeeDto.getEmail()
        );
        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = new EmployeeDto(
        savedEmployee.getId(),
        savedEmployee.getFirstName(),
        savedEmployee.getFirstName(),
        savedEmployee.getEmail()
        );
        return savedEmployeeDto;
    }
}
