package com.zeroToDev.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnnotationDTO {

    private Long id;
    private LectureDTO lecture;
    private TopicDTO topic;

    private String annotation;
    private String explanation;
}
