package com.arryluo.sericefeign.clients.fallback;


import com.arryluo.sericefeign.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 *@author lzb
 * # Feign是自带断路器的
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }
}