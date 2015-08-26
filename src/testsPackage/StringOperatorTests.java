package testsPackage;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import stringOperations.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringOperatorTests {
	
	public static int testCounter = 1;
	
	@Parameter
	public String s;
	
	@Parameters
	public static Collection<Object[]> prepareSamples()
	{
		Object[][] samples = new Object[][] { {"test.String"}, {"testString"} };
		return Arrays.asList(samples);
	}
	
	@Test
	public void findDotShouldReturnTrueIfContainsDot()
	{
		assertEquals("Should return true if it contains dot.", true, StringOperator.findDot(s));
		//assertEquals("Should return false if it contains dot.", false, StringOperator.findDot("testString"));
	}
	
	@Ignore
	public void returnFails()
	{
		fail("Something fails at all.");
	}
	
	@BeforeClass
	public static void GoodMorning()
	{
		System.out.println("Good morning!");
	}
	
	@AfterClass
	public static void Bye()
	{
		System.out.println("Bye!");
	}
	
	@Before
	public void enumerateTests()
	{
		System.out.println("Test no. "+testCounter);
	}
	
	@After
	public void incrementTestCounter()
	{
		testCounter++;
	}
}
