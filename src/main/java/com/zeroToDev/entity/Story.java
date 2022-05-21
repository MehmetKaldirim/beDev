package com.zeroToDev.entity;

import com.zeroToDev.dto.TopicDTO;
import com.zeroToDev.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "stories")
@Where(clause= "is_deleted=false")
public class Story extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    private Lecture lecture;
    @ManyToOne(fetch = FetchType.LAZY)
    private Topic topic;
    private String definition;
    private String solution;
    @Enumerated(EnumType.STRING)
    private Status status;
}
