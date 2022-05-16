package com.zeroToDev.entity;

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

    private String lecture;
    private String topic;
    private String definition;
    private String solution;
    @Enumerated(EnumType.STRING)
    private Status status;
}
