package com.zeroToDev.entity;

import com.zeroToDev.dto.LectureDTO;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class Topic extends BaseEntity{
    private String topicName;

    @ManyToOne
    private Lecture lecture;


    private Integer completedDuration;
    private Integer expectedDuration;
    private Integer countOfAnnotations;
    private Integer countOfDefinitions;
    private Integer countOfStories;
    private Integer countOfReview;
    private LocalDate lastReviewDate;
}
