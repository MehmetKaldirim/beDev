package com.zeroToDev.controller;

import com.zeroToDev.dto.UserDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lecture")
public class LectureController {



    @GetMapping("/createStory")
    public String createUser(Model model) {

        model.addAttribute("user", new UserDTO());


        return "/lecture/create";
    }

    @PostMapping("/create")
    public String insertUser(@ModelAttribute("user") UserDTO user, Model model) {
        //model.addAttribute("user", new UserDTO());
        //model.addAttribute("roles", roleService.findAll());


        //model.addAttribute("users", userService.findAll());

        return "redirect:/user/create";

    }

    @GetMapping("/update/{username}")
    public String updateUser(@PathVariable("username") String username, Model model ){

        return "/user/update";
    }

    @PostMapping("/update")
    public String insertUpdate(UserDTO user){

        return "redirect:/user/create";
    }

    @GetMapping("/delete/{username}")
    public String deleteUser(@PathVariable("username") String username){



        return "redirect:/user/create";
    }
}