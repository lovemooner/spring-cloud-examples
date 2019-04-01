package love.moon.controller;

import love.moon.config.OrderConfig;
import love.moon.pojo.DomainServerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {
    private final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    OrderConfig config;

    @RequestMapping("/account")
    public String save(@RequestParam String name) {
        logger.info("[account] request one  name is " + name);
        try {
            if (1 == 1) throw new DomainServerException("for test");
            return "from account response";
        } catch (DomainServerException e) {
            logger.error(e.getStack(), e);
            throw e;
        }

    }


    @GetMapping("/config")
    public String getConfig() {
        return config.getHello();
    }
}