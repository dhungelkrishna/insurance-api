package com.insurance.insurance.controller;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insurance.model.User;
import com.insurance.insurance.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/user/{msg}")
    public String welcomeUser(@PathVariable String msg) {
        return "Welcome User : " + msg;
    }
    
    @PostMapping("/createuser")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User Created Success." ;
    }

    @DeleteMapping("deleteuser/{id}")
    public String deleteUser(@PathVariable long id) {
        userRepository.deleteById(id);
        return "Deleted User " + userRepository.findById(id); 
    }
}
