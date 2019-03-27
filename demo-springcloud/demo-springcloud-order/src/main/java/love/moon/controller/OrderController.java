package love.moon.controller;

import love.moon.config.OrderConfig;
import love.moon.remote.AccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    AccountClient remote;

    @Autowired
    OrderConfig config;

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

    @GetMapping("/getConfig")
    public String getConfig(){
       return config.getHello();
    }

}