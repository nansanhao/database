package com.example.database.controller;

import com.example.database.mapper.PersonMapper;
import com.example.database.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public Object test() {
        userService.update(102);
        return personMapper.getPerson(102);
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
