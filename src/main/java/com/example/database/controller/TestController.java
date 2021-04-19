package com.example.database.controller;

import com.example.database.entity.InfectResult;
import com.example.database.mapper.PersonMapper;
import com.example.database.service.CloseContactService;
import com.example.database.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private CloseContactService closeContactService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public Object test(Integer id) {
        userService.update(id);
        return personMapper.getPerson(id);
    }

    @RequestMapping(value = "/infectChain")
    @ResponseBody
    public List<InfectResult> infectChain() {
        return closeContactService.getInfectChain();
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
