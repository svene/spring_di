package checkout.spring.config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfigA {

	@Bean
	IService myService() {
		return new MyService();
	}
}
