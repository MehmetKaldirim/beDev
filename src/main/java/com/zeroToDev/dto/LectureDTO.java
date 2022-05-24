package com.zeroToDev.dto;


import com.zeroToDev.enums.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LectureDTO {

    private Long id;
    private String lectureName;

    private Long countOfTopics = 0L;

    private Long completedDuration;

    private Long expectedDuration;

    private Level lectureLevel;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createdDate;
    private String lectureIntro;
}
