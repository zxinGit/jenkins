package com.zxin.jenkins.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxin
 * @date 2020-06-09 15:07
 */
@RestController
@RequestMapping("/test")
public class TestControler {
    @PostMapping("/test")
    public String test(){
        return "hello";
    }
}
