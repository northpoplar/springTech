package com.example.springmvcdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhoucl on 2018/1/31.
 */
@RestController
public class RestfulWebServiceController {
    @GetMapping("/message")
    public MyOutputResource getMessage() {
        return new MyOutputResource("Hello!");
    }
}
