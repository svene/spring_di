package checkout.spring.config1_user;

import checkout.spring.config1public.ConfigAPublic;
import checkout.spring.config1public.IService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ConfigPublicTest {

	@Test
	public void testConfigExplicitly() {
		// Note: only 'ConfigAPublic' can be used here and not 'ConfigA'
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigAPublic.class);
		IService myService = ac.getBean(IService.class);
		assertNotNull(myService);
		assertEquals("MyService.execute", myService.execute());
	}

	@Test
	public void testConfigWithScan() {
		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext();
		acc.scan("checkout.spring.config1public");
		acc.refresh();
		ApplicationContext ac = acc;
		IService myService = ac.getBean(IService.class);
		assertNotNull(myService);
		assertEquals("MyService.execute", myService.execute());
	}

}
