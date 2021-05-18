package se.p950tes.springboottest.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import se.p950tes.springboottest.api.model.HelloWorldResponse;

public class HelloWorldTest {

	private HelloWorldController controller = new HelloWorldController();
	
	@Test
	public void test() throws Exception {
		HelloWorldResponse response = controller.helloWorld();
		assertEquals("Goodbye World2", response.getResponse());
	}
}
