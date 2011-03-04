package checkout.spring.config3;

import javax.annotation.Resource;

public class A {
	@Resource(name = "b")
	private B b;

	public B getB() {
		return b;
	}

	public String doStuff() {
		return "A.doStuff()";
	}
}
