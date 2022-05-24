package com.zeroToDev.dto;

import com.zeroToDev.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
    private Integer countOfReviews = 0;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate lastReviewDate;

    private Status status;
    private String topicIntro;
}
