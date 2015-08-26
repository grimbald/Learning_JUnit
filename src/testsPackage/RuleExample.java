package testsPackage;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.assertTrue;
import testsRules.MyRule;

public class RuleExample {
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Rule
	public MyRule rule = new MyRule();
	
	@Test
	public void testUsingTempFolder() throws IOException
	{
		File createdFolder= folder.newFolder("TempTest");
		File createdFile = folder.newFile("myFile.temp");
		assertTrue(createdFile.exists());
	}
}
