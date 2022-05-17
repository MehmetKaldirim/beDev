package com.zeroToDev.entity;

import com.zeroToDev.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "annotations")
@Where(clause= "is_deleted=false")
public class Annotation extends BaseEntity{

    private String lecture;
    private String topic;
    private String annotation;
    private String explanation;

}
