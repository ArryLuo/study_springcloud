package com.arryluo.ribbon.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author arryluo
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    /*当请求接口请求不通的时候。则进行返回提示*/
    @HystrixCommand(fallbackMethod ="hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
