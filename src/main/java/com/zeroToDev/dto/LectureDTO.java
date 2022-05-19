package com.zeroToDev.dto;


import com.zeroToDev.enums.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LectureDTO {

    private Long id;
    private String lectureName;
    private TopicDTO topic;

    private Integer completedDuration;
    private Integer expectedDuration;
    private Level level;
}
