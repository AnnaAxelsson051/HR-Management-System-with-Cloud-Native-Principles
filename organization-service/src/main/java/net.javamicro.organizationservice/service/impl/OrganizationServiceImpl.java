package net.javamicro.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import net.javamicro.organizationservice.dto.OrganizationDto;
import net.javamicro.organizationservice.entity.Organization;
import net.javamicro.organizationservice.mapper.OrganizationMapper;
import net.javamicro.organizationservice.repository.OrganizationRepository;
import net.javamicro.organizationservice.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}