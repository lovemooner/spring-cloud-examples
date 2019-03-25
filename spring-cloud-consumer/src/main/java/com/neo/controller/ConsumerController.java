package com.neo.controller;

import com.neo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote remote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {

//       try{
           String str= remote.hello(name);
           System.out.println(str);
           return str;
//       }catch (Exception e){
//           e.printStackTrace();
//       }
//       return "falied";
    }

}