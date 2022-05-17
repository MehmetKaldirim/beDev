package com.zeroToDev.service;

import com.zeroToDev.dto.AnnotationDTO;
import com.zeroToDev.dto.StoryDTO;

import java.util.List;

public interface AnnotationService {
    List<AnnotationDTO> listAllStories();
    void save(AnnotationDTO dto);
    void update(AnnotationDTO story);

    void delete(Long id);
    void updateStatus(AnnotationDTO dto);

    AnnotationDTO findById(Long id);
}
