package com.zhongxianyin.helloa;

@RestController
public class HelloAController {

    @RequestMapping(value = "/helloA", method = RequestMethod.POST)
    public String helloA() {
        return "{'Hello',A}";
    }
}