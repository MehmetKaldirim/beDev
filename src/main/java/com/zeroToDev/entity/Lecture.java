package com.zeroToDev.entity;

import com.zeroToDev.dto.TopicDTO;
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
@Table(name = "lectures")
@Where(clause= "is_deleted=false")
public class Lecture extends BaseEntity{

    private String lectureName;

    private Integer countOfTopics = 0;


    private Integer workHours;
    private Integer completedDuration;
    private Integer expectedDuration;

    @Enumerated(EnumType.STRING)
    private Level lectureLevel;


    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    private String lectureIntro;
}
