package com.zeroToDev.mapper;

import com.zeroToDev.dto.RoleDTO;
import com.zeroToDev.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    //if i want to use any method i need to inject ModelMapper

    private final ModelMapper modelMapper;

    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convert to Entity

    public Role convertToEntity(RoleDTO roledto){

        return modelMapper.map(roledto,Role.class);


    }

    //Convert to DTO

    public RoleDTO convertToDto(Role role){
        return modelMapper.map(role,RoleDTO.class);
    }
}
