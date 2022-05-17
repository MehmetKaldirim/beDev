package com.zeroToDev.service.impl;
import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.entity.Story;
import com.zeroToDev.enums.Status;
import com.zeroToDev.mapper.StoryMapper;
import com.zeroToDev.repository.StoryRepository;
import com.zeroToDev.service.StoryService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StoryServiceImpl implements StoryService {

    private final StoryRepository storyRepository;
    private final StoryMapper storyMapper;

    public StoryServiceImpl(StoryRepository storyRepository, StoryMapper storyMapper) {
        this.storyRepository = storyRepository;
        this.storyMapper = storyMapper;
    }

    @Override
    public List<StoryDTO> listAllStories() {
        List<Story> storyList = storyRepository.findAll();
        return storyList.stream().map(storyMapper::convertToDTO).collect(Collectors.toList());
    }


    @Override
    public void save(StoryDTO dto) {
        dto.setStatus(Status.OPEN);
        Story story = storyMapper.convertToEntity(dto);
        storyRepository.save(story);
    }



    @Override
    public void update(StoryDTO dto) {

        Optional<Story> story = storyRepository.findById(dto.getId());
        Story convertedStory = storyMapper.convertToEntity(dto);

        if(story.isPresent()){
            convertedStory.setId(story.get().getId());
            convertedStory.setStatus(dto.getStatus() == null ? story.get().getStatus() : dto.getStatus());
            storyRepository.save(convertedStory);
        }

    }

   /* @Override
    public UserDTO update(UserDTO dto) {

        //Find current user
        User user = userRepository.findByUserName(dto.getUserName());
        //Map updated user dto to entity object
        User convertedUser = userMapper.convertToEntity(dto);
        //set id to converted object
        convertedUser.setId(user.getId());
        //save updated user
        userRepository.save(convertedUser);

        return findByUserName(dto.getUserName());
    }
*/




    @Override
    public void delete(Long id) {

        Optional<Story> foundStory = storyRepository.findById(id);

        if(foundStory.isPresent()){
            foundStory.get().setIsDeleted(true);
            storyRepository.save(foundStory.get());
        }


    }

    @Override
    public void updateStatus(StoryDTO dto) {

        Optional<Story> story = storyRepository.findById(dto.getId());

        if (story.isPresent()) {
            story.get().setStatus(dto.getStatus());
            storyRepository.save(story.get());
        }

    }

    @Override
    public StoryDTO findById(Long id) {
        Optional<Story> story = storyRepository.findById(id);
        if(story.isPresent()){
            return storyMapper.convertToDTO(story.get());
        }
        return null ;
    }
}
