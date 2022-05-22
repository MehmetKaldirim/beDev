package com.zeroToDev.service;

import com.zeroToDev.dto.RoleDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long Id);

}