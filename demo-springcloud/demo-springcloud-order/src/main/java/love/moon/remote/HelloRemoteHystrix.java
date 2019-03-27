package love.moon.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements AccountClient{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "send failed ";
    }
}
