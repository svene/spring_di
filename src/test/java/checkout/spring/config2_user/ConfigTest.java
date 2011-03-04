package checkout.spring.config2_user;

import checkout.spring.config2.A;
import checkout.spring.config2.B;
import checkout.spring.config2.ConfigB;
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

	@Test
	public void testConfigWithScan() {
		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext();
		acc.scan("checkout.spring.config2");
		acc.refresh();
		ApplicationContext ac = acc;

//		B b = ac.getBean(B.class);
//		B b = (B) ac.getBean(/*B.class*/ "b");
		B b = ac.getBean("b", B.class);
		assertNotNull(b);
		assertEquals("B.doStuff()", b.doStuff());

		A a = ac.getBean(A.class);
		assertNotNull(a);
		assertEquals("A.doStuff()", a.doStuff());

		b = ac.getBean("secondBean", B.class);
		assertNotNull(b);
		assertEquals("B.doStuff()", b.doStuff());

	}

}
