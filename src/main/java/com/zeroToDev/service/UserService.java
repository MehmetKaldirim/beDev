package com.zeroToDev.service;

import com.zeroToDev.dto.UserDTO;
import com.zeroToDev.entity.User;


import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();
    User findByUserName(String username);
    void save(UserDTO dto);
    void update(UserDTO dto);
    void deleteByUserName(String username);

    void delete(String username);
}