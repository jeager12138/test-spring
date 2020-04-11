package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = {"/test"})
    @ResponseBody
    public String testFunction(@RequestBody Map m) {
        int id = Integer.parseInt(m.get("id").toString());

        return userService.getUserNameById(id);
    }

}