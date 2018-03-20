package com.zhongxianyin.helloa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAController {

    @RequestMapping(value = "/helloA", method = RequestMethod.POST)
    public String helloA() {
        return "{'Hello',A}";
    }
}