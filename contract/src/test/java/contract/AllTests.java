package contract;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IBoulderDashControllerTest.class, IModelTest.class, IOrderPerformerTest.class, IViewTest.class,
		UserOrderTest.class })
public class AllTests {

}
