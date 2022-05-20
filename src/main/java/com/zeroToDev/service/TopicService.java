package com.zeroToDev.service;

import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.dto.TopicDTO;

import java.util.List;

public interface TopicService {
    List<TopicDTO> listAllTopics();
    void save(TopicDTO dto);
    void update(TopicDTO topic);

    void delete(Long id);
    void updateStatus(TopicDTO dto);

    StoryDTO findById(Long id);
}
