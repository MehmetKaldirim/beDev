package com.zeroToDev.controller;

import com.zeroToDev.dto.AnnotationDTO;
import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.service.AnnotationService;
import com.zeroToDev.service.LectureService;
import com.zeroToDev.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("annotation")
public class AnnotationController {

    private final AnnotationService annotationService;
    private final TopicService topicService;
    private final LectureService lectureService;


    public AnnotationController(AnnotationService annotationService, TopicService topicService, LectureService lectureService) {
        this.annotationService = annotationService;
        this.topicService = topicService;
        this.lectureService = lectureService;
    }

    @GetMapping("/create")
    public String createAnnotation(Model model){
        model.addAttribute("annotation", new AnnotationDTO());
        model.addAttribute("annotations",annotationService.listAllStories());
        model.addAttribute("topics",topicService.listAllTopics());
        model.addAttribute("lectures",lectureService.listAllLectures());
        return "/annotations/annotation-create";
    }
    @PostMapping("/create")
    public String insertAnnotation(@ModelAttribute("annotation") AnnotationDTO ann, Model model) {

        annotationService.save(ann);

        return "redirect:/annotation/create";

    }

}
