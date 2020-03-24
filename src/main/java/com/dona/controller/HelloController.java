package com.dona.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("info")
    public String info() {
        return "Hello 项目经理 Info!!";
    }
}
