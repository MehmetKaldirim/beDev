package com.zeroToDev.dto;

import com.zeroToDev.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicDTO {
    private Long id;

    private String topicName;
    private LectureDTO lecture;


    private Integer completedDuration;
    private Integer totalDuration;
    private Integer countOfAnnotations = 0;
    private Integer countOfDefinitions = 0;
    private Integer countOfStories = 0;
    private Integer countOfReview = 0;
    private LocalDate createDate;
    private LocalDate lastReviewDate;

    private Status status;
    private String topicIntro;
}
