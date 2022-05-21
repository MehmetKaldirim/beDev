package com.zeroToDev.controller;

import com.zeroToDev.dto.LectureDTO;
import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.service.LectureService;
import com.zeroToDev.service.StoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lecture")
public class LectureController {

    private final LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("/create")
    public String createLecture(Model model) {

        model.addAttribute("lecture", new LectureDTO());
        model.addAttribute("lectures", lectureService.listAllLectures());


        return "/lecture/lecture-create";
    }

    @PostMapping("/create")
    public String insertLecture(@ModelAttribute("lecture") LectureDTO lecture, Model model) {

        lectureService.save(lecture);

        return "redirect:/lecture/create";

    }

    @GetMapping("/delete/{id}")
    public String deleteStory(@PathVariable("id") Long id) {
        lectureService.delete(id);
        return "redirect:/lecture/create";
    }

    @GetMapping("/update/{id}")
    public String editStory(@PathVariable("id") Long id, Model model) {

        model.addAttribute("lecture", lectureService.findById(id));
        model.addAttribute("lectures", lectureService.listAllLectures());

        return "/lecture/lecture-update";

    }

    @PostMapping("/update/{id}")
    public String updateStory(@ModelAttribute("lecture") LectureDTO lecture, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {


            model.addAttribute("lectures", lectureService.listAllLectures());

            return "/story/story-update";

        }

        lectureService.update(lecture);
        return "redirect:/lecture/create";
    }


}