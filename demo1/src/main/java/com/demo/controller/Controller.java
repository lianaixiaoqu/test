package com.demo.controller;

import com.demo.service.UserService;
import com.demo.util.basic.ValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 2016/9/23.
 */
@RestController
@RequestMapping("/demo")
public class Controller {

    @Autowired
    private UserService UserService;

    @RequestMapping(value = "/findone", method = RequestMethod.GET)
    public String findOne(Integer id) {
        return ValueUtil.toJson("user", UserService.findByid(id));
    }
}
