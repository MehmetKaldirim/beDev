package com.zeroToDev.service.impl;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.dto.TopicDTO;
import com.zeroToDev.entity.Lecture;
import com.zeroToDev.entity.Topic;
import com.zeroToDev.enums.Status;
import com.zeroToDev.mapper.MapperUtil;
import com.zeroToDev.repository.LectureRepository;
import com.zeroToDev.repository.TopicRepository;
import com.zeroToDev.service.TopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TopicServiceImpl implements TopicService {
    private final TopicRepository topicRepository;
    private final MapperUtil mapperUtil;
    private final LectureRepository lectureRepository;

    public TopicServiceImpl(TopicRepository topicRepository, MapperUtil mapperUtil, LectureRepository lectureRepository) {
        this.topicRepository = topicRepository;
        this.mapperUtil = mapperUtil;
        this.lectureRepository = lectureRepository;
    }

    @Override
    public List<TopicDTO> listAllTopics() {
        return topicRepository.findAll().stream().map(topic -> mapperUtil.convert(topic,new TopicDTO())).collect(Collectors.toList());
    }

    @Override
    public void save(TopicDTO dto) {
        Lecture lecture = new Lecture();
        lecture = lectureRepository.getById(dto.getLecture().getId());
        lecture.setCountOfTopics(lecture.getCountOfTopics()+1);
        dto.setCountOfReviews(dto.getCountOfReviews()+1);
        dto.setStatus(Status.OPEN);

        Topic topic = mapperUtil.convert(dto,new Topic());
        topicRepository.save(topic);

    }

    @Override
    public void update(TopicDTO dto) {
        Optional<Topic> topic = topicRepository.findById(dto.getId());
        Topic convertedTopic = mapperUtil.convert(dto,new Topic());

        if(topic.isPresent()) {
            convertedTopic.setId(topic.get().getId());
            convertedTopic.setStatus(dto.getStatus() == null ? topic.get().getStatus() : dto.getStatus());

            topicRepository.save(convertedTopic);

        }
    }






    @Override
    public void delete(Long id) {

    }

    @Override
    public void updateStatus(TopicDTO dto) {

    }

    @Override
    public TopicDTO retrieveById(Long id) {
        return mapperUtil.convert(topicRepository.getById(id),new TopicDTO());
    }

    @Override
    public List<TopicDTO> readAllByLecture(String lectureName) {

        List<Topic> topics = topicRepository.readAllByLectureLectureName(lectureName);
        return topics.stream().map(t->mapperUtil.convert(t,new TopicDTO())).collect(Collectors.toList());
    }



}
