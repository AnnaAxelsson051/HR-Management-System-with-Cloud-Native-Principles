package net.javamicro.employeeservice.service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import net.javamicro.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


// Service that the feign client will communicate with
// Eureka client will internally use load balancer to
// distribute traffic
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {

    // retrieving department information based on a specified department code
    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
        }

