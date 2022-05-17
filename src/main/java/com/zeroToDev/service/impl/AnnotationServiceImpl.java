package com.zeroToDev.service.impl;

import com.zeroToDev.dto.AnnotationDTO;
import com.zeroToDev.entity.Annotation;
import com.zeroToDev.mapper.MapperUtil;
import com.zeroToDev.mapper.StoryMapper;
import com.zeroToDev.repository.AnnotationRepository;
import com.zeroToDev.repository.StoryRepository;
import com.zeroToDev.service.AnnotationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnnotationServiceImpl implements AnnotationService {
    private final AnnotationRepository annotationRepository;
    private final MapperUtil mapperUtil;

    public AnnotationServiceImpl(AnnotationRepository annotationRepository, MapperUtil mapperUtil) {
        this.annotationRepository = annotationRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<AnnotationDTO> listAllStories() {

        return annotationRepository.findAll().stream().map(ann -> mapperUtil.convert(ann, new AnnotationDTO())).collect(Collectors.toList());

    }

    @Override
    public void save(AnnotationDTO dto) {
        Annotation ann =  mapperUtil.convert(dto,new Annotation());
        annotationRepository.save(ann);
    }

    @Override
    public void update(AnnotationDTO story) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void updateStatus(AnnotationDTO dto) {

    }

    @Override
    public AnnotationDTO findById(Long id) {
        return null;
    }
}
