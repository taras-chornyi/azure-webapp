package com.chornyi.springboot.azure.web;

import com.chornyi.springboot.azure.domain.User;
import com.chornyi.springboot.azure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, azure!";
    }

    @PostMapping("/user")
    public String register(@RequestParam String name) {
        repository.save(User.builder().name(name).build());
        return "registered";
    }

    @GetMapping("/user")
    public List<User> getUserList() {
        return repository.findAll();
    }
    
}
