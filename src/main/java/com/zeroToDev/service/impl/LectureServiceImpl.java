package com.zeroToDev.service.impl;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.entity.Lecture;
import com.zeroToDev.enums.Level;
import com.zeroToDev.mapper.MapperUtil;
import com.zeroToDev.repository.LectureRepository;
import com.zeroToDev.service.LectureService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LectureServiceImpl implements LectureService {

    private final LectureRepository lectureRepository;
    private final MapperUtil mapperUtil;

    public LectureServiceImpl(LectureRepository lectureRepository, MapperUtil mapperUtil) {
        this.lectureRepository = lectureRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<LectureDTO> listAllLectures() {
        return lectureRepository.findAll().stream().map(lec->mapperUtil.convert(lec,new LectureDTO())).collect(Collectors.toList());
    }

    @Override
    public void save(LectureDTO dto) {

        dto.setLectureLevel(Level.BEGINNER);
        //dto.setProjectStatus(Status.OPEN);
        Lecture lecture = mapperUtil.convert(dto,new Lecture());
        lectureRepository.save(lecture);

    }

    @Override
    public void update(LectureDTO dto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void updateStatus(LectureDTO dto) {

    }

    @Override
    public LectureDTO findById(Long id) {
        return null;
    }
}
