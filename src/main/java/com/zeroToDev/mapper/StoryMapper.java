package com.zeroToDev.mapper;

import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.dto.UserDTO;
import com.zeroToDev.entity.Story;
import com.zeroToDev.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StoryMapper {
    private final ModelMapper modelMapper;

    public StoryMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convert to Entity
    public Story convertToEntity(StoryDTO dto){
        return modelMapper.map(dto,Story.class);
    }

    public StoryDTO convertToDTO(Story story){
        return modelMapper.map(story,StoryDTO.class);
    }
}