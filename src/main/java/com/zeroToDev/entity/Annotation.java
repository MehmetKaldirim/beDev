package com.zeroToDev.entity;

import com.zeroToDev.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "annotations")
@Where(clause= "is_deleted=false")
public class Annotation extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    private Lecture lecture;
    @ManyToOne(fetch = FetchType.LAZY)
    private Topic topic;
    private String annotation;
    private String explanation;

}
