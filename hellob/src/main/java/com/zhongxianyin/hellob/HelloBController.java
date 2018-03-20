package com.zhongxianyin.hellob;


@RestController
public class HelloBController {

    @RequestMapping(value = "/helloB", method = RequestMethod.POST)
    public String helloB() {
        return "{'Hello',B}";
    }
}
