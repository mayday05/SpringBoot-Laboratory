package cn.mayday.springboot.lab01.springsecurity.controller;

import cn.mayday.springboot.lab01.springsecurity.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mayday05
 * @date 2020/1/13 21:24
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/demo")
    public String demoFunction() {
        return "示例返回";
    }
}
