package com.example.springmvcdemo.web;

import com.example.springmvcdemo.model.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

/**
 * Created by zhoucl on 2018/1/31.
 */
@Controller
public class InternalsController {
    private static final String LOGIN = "me";
    private static final String PASSWORD = "pass";

    @GetMapping("/")
    public String hello() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(LoginData loginData) {
        if (LOGIN.equals(loginData.getLogin()) && PASSWORD.equals(loginData.getPassword())) {
            return new ModelAndView("success", Collections.singletonMap("login", loginData.getLogin()));
        } else {
            return new ModelAndView("failure", Collections.singletonMap("login", loginData.getLogin()));
        }
    }

    @ResponseBody
    @PostMapping("/message")
    public MyOutputResource sendMessage(@RequestBody MyInputResource inputResource) {
        return new MyOutputResource("Received: " + inputResource.getRequestMessage());
    }

}
