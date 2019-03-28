package love.moon.controller;

import love.moon.config.OrderConfig;
import love.moon.remote.AccountClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    AccountClient remote;

    @Autowired
    OrderConfig config;

    @RequestMapping("/hello/{name}")
    public String saveOrder(@PathVariable("name") String name) {
        logger.info("saveOrder1==");
        logger.info("saveOrder2==");

        try {
//           String str= remote.hello(name);
//           System.out.println(str);
//           return str;
            if (1 == 1) {
                throw new NullPointerException("my Exception=====");
            }
            return "from-order";

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return "falied";

        }
    }

    @GetMapping("/getConfig")
    public String getConfig() {
        return config.getHello();
    }

}