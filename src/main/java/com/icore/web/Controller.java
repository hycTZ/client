package com.icore.web;


import com.icore.feign.ServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class Controller {

    @Autowired
    ServerFeign serverFeign;

    @RequestMapping("/client")
    public String test(){
        return "TEST-C L E N T";
    }

    @RequestMapping("/feign")
    public String feign(){
        return serverFeign.hander();
    }




}
