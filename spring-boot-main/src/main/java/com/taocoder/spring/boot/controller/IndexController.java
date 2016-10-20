/*
* Copyright (c) 2015 taocoder.com. All Rights Reserved.
*/
package com.taocoder.spring.boot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tao.ke Date: 16/10/21 Time: 上午12:48
 */
@Controller
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    String index() {
        System.out.println("aaaaaaa");
        return "Hello Spring Boot!";
    }
}
