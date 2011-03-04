package checkout.spring.config1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ConfigTest {

	@Test
	public void testConfigExplicitly() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigA.class);
		IService myService = ac.getBean(IService.class);
		assertNotNull(myService);
		assertEquals("MyService.execute", myService.execute());
	}

	@Test
	public void testConfigWithScan() {
		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext();
		acc.scan("checkout.spring.config1");
		acc.refresh();
		ApplicationContext ac = acc;
		IService myService = ac.getBean(IService.class);
		assertNotNull(myService);
		assertEquals("MyService.execute", myService.execute());
	}

}
