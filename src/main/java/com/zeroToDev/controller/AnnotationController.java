package com.zeroToDev.controller;

import com.zeroToDev.dto.AnnotationDTO;
import com.zeroToDev.dto.StoryDTO;
import com.zeroToDev.service.AnnotationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("annotation")
public class AnnotationController {

    private final AnnotationService annotationService;

    public AnnotationController(AnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    @GetMapping("/create")
    public String createAnnotation(Model model){
        model.addAttribute("annotation", new AnnotationDTO());
        model.addAttribute("annotations",annotationService.listAllStories());
        return "/annotations/annotation-create";
    }
    @PostMapping("/create")
    public String insertAnnotation(@ModelAttribute("annotation") AnnotationDTO ann, Model model) {

        annotationService.save(ann);

        return "redirect:/annotation/create";

    }

}
