package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class hookexample {

	@Before
	public void setup() {
		System.out.println("before Scenarion");
	}
	@After
	public void closeBrwser() {
		System.out.println("After scenario");
	}
	@BeforeStep
	public void data() {
		System.out.println("before step");
	}
	@AfterStep
	public void data1() {
		System.out.println("after step");
	}
}
