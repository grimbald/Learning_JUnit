package testsPackage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import mathemathicOperations.*;
import testsPackage.AllTestsSuite.UnimplementedTests;

public class MathemathicOperationsTests {
	
	@Test
	public void powerByZeroShouldBeOne ()
	{
		assertEquals("Powering by zero should always be 1.", 1, Power.powerBy(2,0));
	}
	
	@Test
	@Category(UnimplementedTests.class)
	public void unimplementedTest()
	{
		fail("Unimplemented method");
	}
}
