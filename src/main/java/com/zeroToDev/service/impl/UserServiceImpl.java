package com.zeroToDev.service.impl;

import com.zeroToDev.dto.UserDTO;
import com.zeroToDev.service.CrudService;

import java.util.List;

import com.zeroToDev.service.UserService;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService  {
    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(), object);
    }



    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public void update(UserDTO object) {
        super.update(object.getUserName(), object);
    }

    @Override
    public UserDTO findById(String id) {
        return super.findById(id);
    }



}