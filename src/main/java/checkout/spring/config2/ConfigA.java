package checkout.spring.config2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfigA {
	public @Bean A a() {
		return new A();
	}
}
