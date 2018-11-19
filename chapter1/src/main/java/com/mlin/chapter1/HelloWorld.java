package com.mlin.chapter1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author merlin.xu
 * @create 2018-11-15-16:35
 */
@RestController
    public class HelloWorld {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}