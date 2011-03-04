package checkout.spring.config2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ConfigTest {

	@Test
	public void testConfigExplicitly() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigB.class);

		B b = ac.getBean("b", B.class);
		assertNotNull(b);
		assertEquals("B.doStuff()", b.doStuff());

		A a = ac.getBean(A.class);
		assertNotNull(a);
		assertEquals("A.doStuff()", a.doStuff());

	}

}
