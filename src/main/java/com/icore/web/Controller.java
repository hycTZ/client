package com.icore.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class Controller {

    @RequestMapping("/client")
    public String test(){
        return "TEST-OK********************";
    }



    

}
