package com.zeroToDev.service;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.dto.StoryDTO;

import java.util.List;

public interface LectureService {

    List<LectureDTO> listAllLectures();
    void save(LectureDTO dto);
    void update(LectureDTO dto);

    void delete(Long id);
    void updateStatus(LectureDTO dto);

    LectureDTO findById(Long id);
}
