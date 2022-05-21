package com.zeroToDev.mapper;


import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.entity.Lecture;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class LectureMapper {

    private final ModelMapper modelMapper;

    public LectureMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convert to Entity

    public Lecture convertToEntity(LectureDTO dto){

        return modelMapper.map(dto,Lecture.class);



    }

    //Convert to DTO

    public LectureDTO convertToDto(Lecture entity){
        return modelMapper.map(entity,LectureDTO.class);
    }
}
