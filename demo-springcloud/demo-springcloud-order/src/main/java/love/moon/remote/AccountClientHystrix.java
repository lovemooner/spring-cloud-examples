package love.moon.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class AccountClientHystrix implements AccountClient{

    @Override
    public String pay(@RequestParam(value = "name") String name) {
        return "Hystrix:send failed ";
    }
}
