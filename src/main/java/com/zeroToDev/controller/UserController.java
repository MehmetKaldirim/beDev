package com.zeroToDev.controller;

import com.zeroToDev.dto.RoleDTO;
import com.zeroToDev.dto.UserDTO;
import com.zeroToDev.service.RoleService;
import com.zeroToDev.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    RoleService roleService;
    UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model) {

        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles", roleService.listAllRoles());
        model.addAttribute("users", userService.listAllUsers());

        return "/user/create";
    }

    @PostMapping("/create")
    public String insertUser(@ModelAttribute("user") UserDTO user, Model model) {
        //model.addAttribute("user", new UserDTO());
        //model.addAttribute("roles", roleService.findAll());

        userService.save(user);
        //model.addAttribute("users", userService.findAll());

        return "redirect:/user/create";

    }

    @GetMapping("/update/{username}")
    public String updateUser(@PathVariable("username") String username, Model model ){

        model.addAttribute("user", userService.findByUserName(username));

        model.addAttribute("roles", roleService.listAllRoles());
        model.addAttribute("users", userService.listAllUsers());

        return "/user/update";
    }

    @PostMapping("/update")
    public String insertUpdate(UserDTO user){
        userService.update(user);
        return "redirect:/user/create";
    }

    @GetMapping("/delete/{username}")
    public String deleteUser(@PathVariable("username") String username){

        userService.delete(username);

        return "redirect:/user/create";
    }
}
