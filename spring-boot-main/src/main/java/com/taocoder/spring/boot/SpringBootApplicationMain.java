/*
* Copyright (c) 2015 taocoder.com. All Rights Reserved.
*/
package com.taocoder.spring.boot;

import com.taocoder.spring.boot.controller.IndexController;
import org.springframework.boot.SpringApplication;

/**
 * @author tao.ke Date: 16/10/21 Time: 上午12:47
 */
public class SpringBootApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(IndexController.class,args);
    }
}
