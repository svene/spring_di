package checkout.spring;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	checkout.spring.config1.ConfigTest.class
	, checkout.spring.config1_user.ConfigTest.class
	, checkout.spring.config2.ConfigTest.class
	, checkout.spring.config2_user.ConfigTest.class
})
public class AllTests {
}
