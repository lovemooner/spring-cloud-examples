package love.moon.controller;

import love.moon.config.OrderConfig;
import love.moon.pojo.ServerException;
import love.moon.remote.AccountClient;
import love.moon.remote.InventoryClient;
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
    AccountClient accountClient;
    @Autowired
    InventoryClient inventoryClient;
    @Autowired
    OrderConfig config;

    @RequestMapping("/list/{name}")
    public String list(@PathVariable("name") String name) {
        logger.info("saveOrder1==");
        try {
           return accountClient.pay(name);
        } catch (Exception e) {
            ServerException exception=new ServerException(e.getMessage(),e);
            logger.error(exception.getStack(), exception);
            return "falied";

        }
    }

    /**
     * test config server
     * @return
     */
    @GetMapping("/config")
    public String getConfig() {
        return config.getHello();
    }

}