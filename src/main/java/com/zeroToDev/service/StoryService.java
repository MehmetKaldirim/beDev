package com.zeroToDev.service;

import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.dto.UserDTO;
import com.zeroToDev.entity.Story;
import com.zeroToDev.entity.User;

import java.util.List;

public interface StoryService {

    List<StoryDTO> listAllStories();
    void save(StoryDTO dto);
    void update(StoryDTO story);

    void delete(Long id);
    void updateStatus(StoryDTO dto);

    StoryDTO findById(Long storyId);



}
