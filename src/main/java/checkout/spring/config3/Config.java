package checkout.spring.config3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Config {

	public @Bean
	checkout.spring.config3.A a() {
		return new A();
	}
	public @Bean
	checkout.spring.config3.B b() {
		return new B();
	}

}
