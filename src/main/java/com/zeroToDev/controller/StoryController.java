package com.zeroToDev.controller;

import com.zeroToDev.dto.StoryDTO;

import com.zeroToDev.service.LectureService;
import com.zeroToDev.service.StoryService;
import com.zeroToDev.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/story")
public class StoryController {

    private final StoryService storyService;
    private final TopicService topicService;
    private final LectureService lectureService;

    public StoryController(StoryService storyService, TopicService topicService, LectureService lectureService) {
        this.storyService = storyService;
        this.topicService = topicService;
        this.lectureService = lectureService;
    }

    @GetMapping("/create")
    public String createStory(Model model) {

        model.addAttribute("story", new StoryDTO());
        model.addAttribute("stories", storyService.listAllStories());
        model.addAttribute("topics",topicService.listAllTopics());
        model.addAttribute("lectures",lectureService.listAllLectures());

        return "/story/story-create";
    }

    @PostMapping("/create")
    public String insertStory(@ModelAttribute("story") StoryDTO story, Model model) {

        storyService.save(story);

        return "redirect:/story/create";

    }

    @GetMapping("/delete/{storyId}")
    public String deleteStory(@PathVariable("storyId") Long storyId) {
        storyService.delete(storyId);
        return "redirect:/story/create";
    }

    @GetMapping("/update/{id}")
    public String editStory(@PathVariable("id") Long id, Model model) {

        model.addAttribute("story", storyService.findById(id));
        model.addAttribute("stories", storyService.listAllStories());

        return "/story/story-update";

    }

    @PostMapping("/update/{id}")
    public String updateStory(@ModelAttribute("story") StoryDTO story, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {


            model.addAttribute("stories", storyService.listAllStories());

            return "/story/story-update";

        }

        storyService.update(story);
        return "redirect:/story/create";
    }


}