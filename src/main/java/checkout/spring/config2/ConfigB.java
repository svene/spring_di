package checkout.spring.config2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigB {
	public @Bean B b() {
		return new B();
	}
	public @Bean(name="secondBean") B b2() {
		return new B();
	}
}
