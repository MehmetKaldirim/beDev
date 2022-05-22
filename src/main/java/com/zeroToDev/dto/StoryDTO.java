package com.zeroToDev.dto;

import com.zeroToDev.entity.Lecture;
import com.zeroToDev.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class StoryDTO {
    private Long id;
    private LectureDTO lecture;
    private TopicDTO topic;

    private String definition;
    private String solution;
    private Status status;
}
