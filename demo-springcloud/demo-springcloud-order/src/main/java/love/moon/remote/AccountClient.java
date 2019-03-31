package love.moon.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-account",fallback = AccountClientHystrix.class)
//@FeignClient(name= "spring-cloud-account")
public interface AccountClient {

    @RequestMapping(value = "/account")
    String pay(@RequestParam(value = "name") String name);
}

