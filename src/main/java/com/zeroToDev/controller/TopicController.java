package com.zeroToDev.controller;

import com.zeroToDev.dto.TopicDTO;
import com.zeroToDev.service.LectureService;
import com.zeroToDev.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topic")
public class TopicController {

    private final TopicService topicService;
    private final LectureService lectureService;

    public TopicController(TopicService topicService, LectureService lectureService) {
        this.topicService = topicService;
        this.lectureService = lectureService;
    }

    @GetMapping("/create")
    public String createTopic(Model model) {

        model.addAttribute("topic", new TopicDTO());
        model.addAttribute("topicss", topicService.listAllTopics());
        model.addAttribute("lectures", lectureService.listAllLectures());


        return "/topic/topic-create";
    }

    @PostMapping("/create")
    public String insertTopic(@ModelAttribute("topic") TopicDTO topic, Model model) {

        topicService.save(topic);

        return "redirect:/topic/create";

    }
/*
    @GetMapping("/delete/{storyId}")
    public String deleteStory(@PathVariable("storyId") Long storyId) {
        lectureService.delete(storyId);
        return "redirect:/story/create";
    }

    @GetMapping("/update/{id}")
    public String editStory(@PathVariable("id") Long id, Model model) {

        model.addAttribute("story", lectureService.findById(id));
        model.addAttribute("stories", lectureService.listAllStories());

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

*/
}