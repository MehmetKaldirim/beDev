package com.zeroToDev;

import com.zeroToDev.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class BeDevApplication {

    static RoleRepository roleRepository;

    public BeDevApplication(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(BeDevApplication.class, args);
        //roleRepository.findAll().stream().forEach(System.out::println);
    }

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

}
