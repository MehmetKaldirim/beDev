package com.zeroToDev.bootstrap;

import com.zeroToDev.dto.RoleDTO;
import com.zeroToDev.dto.UserDTO;
import com.zeroToDev.enums.Gender;
import com.zeroToDev.service.RoleService;
import com.zeroToDev.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    UserService userService;
    RoleService roleService;

    public DataGenerator(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1l,"Admin");
        RoleDTO teacherRole = new RoleDTO(2l,"Teacher");
        RoleDTO mentorRole = new RoleDTO(3l,"Mentor");
        RoleDTO devRole = new RoleDTO(4l,"Developer");

        roleService.save(adminRole);
        roleService.save(mentorRole);
        roleService.save(devRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "john@cydeo.com", "Abc1", true, "7459684532", mentorRole, Gender.MALE);
        UserDTO user5 = new UserDTO("Mike", "Smith",
                "mike@cydeo.com", "Abc2", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "delisa@cydeo.com", "123", true, "8567412358", mentorRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "craig@cydeo.com", "Abc3", true, "7777775566", teacherRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "shaun@cydeo.com", "Abc4", true, "3256987412", mentorRole, Gender.MALE);
        UserDTO user6 = new UserDTO("Elizebeth",
                "Loren", "elizebeth@cydeo.com", "Abc4", true, "5306987412", devRole, Gender.FEMALE);
        UserDTO user7 = new UserDTO("Maria",
                "Ada", "maria@cydeo.com", "Abc4", true, "9996987412", devRole, Gender.FEMALE);
        UserDTO user8 = new UserDTO("Bill",
                "Matt", "bill@cydeo.com", "Abc4", true, "8881239846", devRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);


    }
}
