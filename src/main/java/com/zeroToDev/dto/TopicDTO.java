package com.zeroToDev.dto;

import com.zeroToDev.enums.Status;

import java.time.LocalDate;

public class TopicDTO {
    private Long id;

    private String topicName;
    private LectureDTO lecture;


    private Integer completedDuration;
    private Integer expectedDuration;
    private Integer countOfAnnotations;
    private Integer countOfDefinitions;
    private Integer countOfStories;
    private Integer countOfReview;
    private LocalDate lastReviewDate;

    private Status status;
}
