package com.arryluo.client.eurekaclient.action;

import com.arryluo.client.eurekaclient.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAction {
    @Value("${server.port}")
    private String port;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        System.out.println(userMapper.getall());
        return "hi " + name + " ,i am from port:" + port;
    }
}
