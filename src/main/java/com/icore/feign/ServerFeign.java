package com.icore.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "server")
public interface ServerFeign {

    @RequestMapping(value = "/boot/test")
    public String hander();

}
