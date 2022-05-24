package com.zeroToDev.service.impl;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.entity.Lecture;
import com.zeroToDev.enums.Level;
import com.zeroToDev.mapper.LectureMapper;
import com.zeroToDev.mapper.MapperUtil;
import com.zeroToDev.repository.LectureRepository;
import com.zeroToDev.service.LectureService;
import com.zeroToDev.service.TopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LectureServiceImpl implements LectureService {

    private final LectureRepository lectureRepository;
    private final MapperUtil mapperUtil;
    private final LectureMapper lectureMapper;
    private final TopicService topicService;

    public LectureServiceImpl(LectureRepository lectureRepository, MapperUtil mapperUtil, LectureMapper lectureMapper, TopicService topicService) {
        this.lectureRepository = lectureRepository;
        this.mapperUtil = mapperUtil;
        this.lectureMapper = lectureMapper;
        this.topicService = topicService;
    }

    @Override
    public List<LectureDTO> listAllLectures() {
        return lectureRepository.findAll().stream().map(lec->mapperUtil.convert(lec,new LectureDTO())).collect(Collectors.toList());
    }

    @Override
    public void save(LectureDTO dto) {

        dto.setLectureLevel(Level.BEGINNER);
        Lecture convertedLecture = mapperUtil.convert(dto,new Lecture());
        //dto.setProjectStatus(Status.OPEN);
        Long countOfTopics =topicService.readAllByLecture(dto.getLectureName()).stream().count();
        convertedLecture.setCountOfTopics(countOfTopics);

        lectureRepository.save(convertedLecture);

    }

    @Override
    public void update(LectureDTO dto) {
        Lecture lec = lectureRepository.getById(dto.getId());
        Lecture convertedLecture = mapperUtil.convert(dto,new Lecture());
        convertedLecture.setId(lec.getId());
        convertedLecture.setCreatedDate(lec.getCreatedDate());
        Long countOfTopics =topicService.readAllByLecture(dto.getLectureName()).stream().count();
        convertedLecture.setCountOfTopics(countOfTopics);
        convertedLecture.setCompletedDuration(calculateCompletedDuration(dto.getLectureName()));
        convertedLecture.setLectureLevel(lec.getLectureLevel());

        lectureRepository.save(convertedLecture);

    }

    @Override
    public void delete(Long id) {
        Lecture lecture =  lectureRepository.getById(id);
        lecture.setIsDeleted(true);
        lectureRepository.save(lecture);

    }

    @Override
    public void updateStatus(LectureDTO dto) {

    }

    @Override
    public LectureDTO retrieveById(Long id) {
        return lectureMapper.convertToDto(lectureRepository.findById(id).get());
    }

    @Override
    public Long calculateCompletedDuration(String lectureName) {
        Long sumOfCompleted= Long.valueOf(topicService.readAllByLecture(lectureName).stream().map(x -> x.getCompletedDuration()).reduce(0, (a, b) -> a+b));

        return sumOfCompleted;
    }


}
