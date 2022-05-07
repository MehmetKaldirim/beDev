package com.zeroToDev.service;

import com.zeroToDev.dto.RoleDTO;
import com.zeroToDev.dto.UserDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long Id);

}