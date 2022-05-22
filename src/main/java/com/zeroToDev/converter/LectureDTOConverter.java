package com.zeroToDev.converter;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.service.LectureService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
@ConfigurationPropertiesBinding
public class LectureDTOConverter implements Converter<String, LectureDTO> {

    private final LectureService lectureService;

    public LectureDTOConverter(@Lazy LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @Override
    public LectureDTO convert(String source) {
        if(source == null || source.equals("")) {
            return null;
        }
        return lectureService.retrieveById(Long.parseLong(source));
    }



}
