package net.javamicro.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import net.javamicro.departmentservice.dto.DepartmentDto;
import net.javamicro.departmentservice.entity.Department;
import net.javamicro.departmentservice.repository.DepartmentRepository;
import net.javamicro.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;
import net.javamicro.departmentservice.mapper.DepartmentMapper;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    //Converting department dto to entity
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    //Fetching a department creating a departmentDto
    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);
        return departmentDto;
    }
}
