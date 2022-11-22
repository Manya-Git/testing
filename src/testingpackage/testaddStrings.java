package testingpackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		testingfunctions junitstring = new testingfunctions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
