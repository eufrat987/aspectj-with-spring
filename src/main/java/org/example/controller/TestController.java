package org.example.controller;

import org.example.domainlz.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("test")
    public void test() {
        new Account().foo();
        System.out.println("textdone");
    }

}
