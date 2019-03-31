package love.moon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger logger = LoggerFactory.getLogger(OrderApplication.class);
		logger.info("测试log");

//		for (int i = 0; i < 10; i++) {
//			logger.error("something wrong. id={}; name=Ryan-{};", i, i);
//		}
	}

}
