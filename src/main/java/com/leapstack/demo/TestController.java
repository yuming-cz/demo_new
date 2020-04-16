package com.leapstack.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("say")
    public String toStsring() {

        return "第一个spring-boot项目";
    }



    @RequestMapping("do")
    public String toDone() {

        return "....................";
    }



}

