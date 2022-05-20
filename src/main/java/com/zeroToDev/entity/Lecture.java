package com.zeroToDev.entity;

import com.zeroToDev.dto.TopicDTO;
import com.zeroToDev.enums.Level;
import com.zeroToDev.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "lectures")
@Where(clause= "is_deleted=false")
public class Lecture extends BaseEntity{

    private String lectureName;

    private Integer countOfTopics;

    private Integer completedDuration;
    private Integer expectedDuration;
    private Level level;
}
