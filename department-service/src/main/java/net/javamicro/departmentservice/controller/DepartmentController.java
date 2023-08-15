package net.javamicro.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.javamicro.departmentservice.dto.DepartmentDto;
import net.javamicro.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;

    //Saving department
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    //Getting department by code
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto>getDepartment(@PathVariable("department-code") String departmentCode){
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
    return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
