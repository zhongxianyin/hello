package com.zhongxianyin.hellob;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBController {

    @RequestMapping(value = "/helloB", method = RequestMethod.POST)
    public String helloB() {
        return "{'Hello',B}";
    }
}
