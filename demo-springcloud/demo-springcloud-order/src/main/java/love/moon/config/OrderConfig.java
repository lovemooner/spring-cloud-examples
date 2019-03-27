package love.moon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
//@RefreshScope
public class OrderConfig {

//    @Value("${neo.hello}")
    private String hello;

    public String getHello() {
        return hello;
    }
}
