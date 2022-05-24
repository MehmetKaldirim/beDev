package com.zeroToDev.service;

import com.zeroToDev.dto.LectureDTO;

import java.util.List;

public interface LectureService {

    List<LectureDTO> listAllLectures();
    void save(LectureDTO dto);
    void update(LectureDTO dto);

    void delete(Long id);

    void updateStatus(LectureDTO dto);



    LectureDTO retrieveById(Long id);

    Long calculateCompletedDuration(String lectureName);
}
