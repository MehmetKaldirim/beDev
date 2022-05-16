package com.zeroToDev.controller;

import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.dto.UserDTO;

import com.zeroToDev.service.StoryService;
import com.zeroToDev.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lecture")
public class LectureController {

    private final StoryService storyService;

    public LectureController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping("/create")
    public String createUser(Model model) {

        model.addAttribute("story", new StoryDTO());
        model.addAttribute("stories", storyService.listAllStories());


        return "/lecture/create";
    }

    @PostMapping("/create")
    public String insertStory(@ModelAttribute("story") StoryDTO story, Model model) {

        storyService.save(story);

        return "redirect:/lecture/create";

    }

    @GetMapping("/delete/{storyId}")
    public String deleteStory(@PathVariable("storyId") Long storyId) {
        storyService.delete(storyId);
        return "redirect:/lecture/create";
    }

    @GetMapping("/update/{id}")
    public String editStory(@PathVariable("id") Long id, Model model) {

        model.addAttribute("story", storyService.findById(id));
        model.addAttribute("stories", storyService.listAllStories());

        return "lecture/update";

    }

    @PostMapping("/update/{id}")
    public String updateStory(@ModelAttribute("story") StoryDTO story, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {


            model.addAttribute("stories", storyService.listAllStories());

            return "/lecture/update";

        }

        storyService.update(story);
        return "redirect:/lecture/create";
    }


}