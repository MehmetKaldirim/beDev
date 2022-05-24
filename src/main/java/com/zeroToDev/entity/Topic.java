package com.zeroToDev.entity;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.enums.Level;
import com.zeroToDev.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "topics")
@Where(clause= "is_deleted=false")
public class Topic extends BaseEntity{
    private String topicName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Lecture lecture;


    private Integer completedDuration;
    private Integer totalDuration;

    private Integer countOfAnnotations = 0;
    private Integer countOfDefinitions = 0;
    private Integer countOfStories = 0;
    private Integer countOfReviews = 0;

    @Column(columnDefinition = "DATE")
    private LocalDate createDate;
    @Column(columnDefinition = "DATE")
    private LocalDate lastReviewDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String topicIntro;
}
