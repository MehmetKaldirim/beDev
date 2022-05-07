package com.zeroToDev.mapper;

import com.zeroToDev.dto.UserDTO;
import com.zeroToDev.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final ModelMapper modelMapper;
    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convert to Entity
    public User convertToUser(UserDTO dto){
        return modelMapper.map(dto,User.class);
    }

    public UserDTO convertToDTO(User user){
        return modelMapper.map(user,UserDTO.class);
    }
}
