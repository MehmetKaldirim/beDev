package com.zeroToDev.service.impl;

import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.dto.TopicDTO;
import com.zeroToDev.entity.Topic;
import com.zeroToDev.enums.Status;
import com.zeroToDev.mapper.MapperUtil;
import com.zeroToDev.repository.TopicRepository;
import com.zeroToDev.service.TopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicServiceImpl implements TopicService {
    private final TopicRepository topicRepository;
    private final MapperUtil mapperUtil;

    public TopicServiceImpl(TopicRepository topicRepository, MapperUtil mapperUtil) {
        this.topicRepository = topicRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<TopicDTO> listAllTopics() {
        return topicRepository.findAll().stream().map(topic -> mapperUtil.convert(topic,new TopicDTO())).collect(Collectors.toList());
    }

    @Override
    public void save(TopicDTO dto) {

        dto.setCountOfReview(dto.getCountOfReview()+1);
        dto.setStatus(Status.OPEN);
        Topic topic = mapperUtil.convert(dto,new Topic());
        topicRepository.save(topic);

    }

    @Override
    public void update(TopicDTO topic) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void updateStatus(TopicDTO dto) {

    }

    @Override
    public StoryDTO findById(Long id) {
        return null;
    }
}
