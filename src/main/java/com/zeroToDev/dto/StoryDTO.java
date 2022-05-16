package com.zeroToDev.dto;

import com.zeroToDev.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class StoryDTO {
    private Long id;
    private String lecture;
    private String topic;

    private String definition;
    private String solution;
    private Status status;
}
