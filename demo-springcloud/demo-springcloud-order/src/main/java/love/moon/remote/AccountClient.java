package love.moon.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-account",fallback = HelloRemoteHystrix.class)
public interface AccountClient {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}

