package checkout.spring.config3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ConfigTest {
	@Test
	public void testConfigWithScan() {
		// Initialize Spring Container:
		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext();
		acc.scan("checkout.spring.config3");
		acc.refresh();
		ApplicationContext ac = acc;

		A a = ac.getBean("a", A.class);
		assertNotNull(a);
		assertEquals("A.doStuff()", a.doStuff());

		B b = a.getB();
		assertNotNull(b);
		assertEquals("B.doStuff()", b.doStuff());
	}
}
