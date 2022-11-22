package testingpackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		testingfunctions junit = new testingfunctions();
		int result = junit.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
