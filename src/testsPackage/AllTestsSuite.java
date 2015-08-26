package testsPackage;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testsPackage.AllTestsSuite.UnimplementedTests;;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@ExcludeCategory(UnimplementedTests.class)
@SuiteClasses({
	MathemathicOperationsTests.class,
	StringOperatorTests.class
	})
public class AllTestsSuite {
	//Categories
		public static interface UnimplementedTests {}
}
