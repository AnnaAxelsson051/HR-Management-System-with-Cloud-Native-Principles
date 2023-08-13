package net.javamicro.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import net.javamicro.departmentservice.dto.DepartmentDto;
import net.javamicro.departmentservice.repository.DepartmentRepository;
import net.javamicro.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        return null;
    }
}
