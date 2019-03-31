package love.moon.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "spring-cloud-inventory")
public interface InventoryClient {

    @RequestMapping(value = "/inventory")
    String get();
}

