package checkout.spring.config1public;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAPublic {

	@Bean
	IService myService() {
		return new MyService();
	}
}
