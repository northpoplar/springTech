package com.example.springmvcdemo.web;

/**
 * Created by zhoucl on 2018/1/31.
 */
public class MyOutputResource {

    private String responseMessage;

    public MyOutputResource(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

}
