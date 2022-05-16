package com.zeroToDev.service.impl;

import com.zeroToDev.dto.UserDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.zeroToDev.entity.User;
import com.zeroToDev.mapper.RoleMapper;
import com.zeroToDev.mapper.UserMapper;
import com.zeroToDev.repository.UserRepository;
import com.zeroToDev.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService  {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RoleMapper roleMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, RoleMapper roleMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<UserDTO> listAllUsers() {

        List<User> userList = userRepository.findAll();
        return userList.stream().map(userMapper::convertToDTO).collect(Collectors.toList());
    }



    @Override
    public UserDTO findByUserName(String username) {
        User user = userRepository.findByUserName(username);
        return userMapper.convertToDTO(user);
    }

    @Override
    public void save(UserDTO dto) {
        User addUser = userMapper.convertToUser(dto);
        addUser.setEnabled(true);
        userRepository.save(addUser);
    }


    @Override
    public UserDTO update(UserDTO dto) {
        //Find current user
        User addUser = userRepository.findByUserName((dto.getUserName()));
        //Find updated dto to entity object
        User converterUser = userMapper.convertToUser(dto);
        //set id to converted object
        converterUser.setId(addUser.getId());
        //save updated user
        userRepository.save(converterUser);
        return findByUserName(dto.getUserName());
    }






    @Override
    public void deleteByUserName(String username) {

     userRepository.deleteByUserName(username);
    }

    @Override
    public void delete(String username) {
        User user =  userRepository.findByUserName(username);
        user.setIsDeleted(true);
        userRepository.save(user);
    }
}