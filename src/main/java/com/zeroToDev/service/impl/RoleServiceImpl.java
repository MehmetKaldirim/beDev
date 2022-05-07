package com.zeroToDev.service.impl;

import com.zeroToDev.dto.RoleDTO;
import com.zeroToDev.entity.Role;
import com.zeroToDev.entity.User;
import com.zeroToDev.mapper.RoleMapper;
import com.zeroToDev.repository.RoleRepository;
import com.zeroToDev.service.RoleService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl  implements RoleService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {


        // controlling calling me and want all roles and where they are in Repository
        //how can i call them of coz injection

        List<Role> roleList = roleRepository.findAll();
        //here i need mechanism convert roleList to RoleDTO = it is Mapper a new Story begin
        List<RoleDTO> list2= roleList.stream().map(roleMapper :: convertToDto).collect(Collectors.toList());
        return list2;
    }

    @Override
    public RoleDTO findById(Long id) {

        return roleMapper.convertToDto(roleRepository.findById(id).get());
    }




}

