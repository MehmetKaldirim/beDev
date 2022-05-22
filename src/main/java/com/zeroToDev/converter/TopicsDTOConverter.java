package com.zeroToDev.converter;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.dto.RoleDTO;
import com.zeroToDev.dto.TopicDTO;
import com.zeroToDev.service.RoleService;
import com.zeroToDev.service.TopicService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class TopicsDTOConverter implements Converter<String, TopicDTO> {

    TopicService topicService;

    public TopicsDTOConverter(@Lazy TopicService topicService) {
        this.topicService = topicService;
    }


    @Override
    public TopicDTO convert(String source) {
        if(source == null || source.equals("")) {
            return null;
        }
        return topicService.retrieveById(Long.parseLong(source));
    }



}