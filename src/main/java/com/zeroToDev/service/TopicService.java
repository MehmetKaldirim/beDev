package com.zeroToDev.service;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.dto.TopicDTO;
import com.zeroToDev.entity.Lecture;

import java.util.List;

public interface TopicService {
    List<TopicDTO> listAllTopics();
    void save(TopicDTO dto);
    void update(TopicDTO topic);

    void delete(Long id);
    void updateStatus(TopicDTO dto);

    TopicDTO retrieveById(Long id);

    List<TopicDTO> readAllByLecture(String lectureName);


}
