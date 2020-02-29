package ku.util;

import java.util.List;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Run JUnit Test suites using my test runner.
 * @author jim
 */
public class TestRunner {
	/** 
	 * My test runner. It displays more information about
	 * the results than JUnit's TestRunner.
	 * Run a test suite and describe the results. 
	 * @param testclass name of class containing JUnit tests
	 */
	public static void runTests( Class<?> testclass) {
		Result result = org.junit.runner.JUnitCore.runClasses( testclass );
		int count = result.getRunCount();
		int failed = result.getFailureCount();
		System.out.printf("%s: Running %d tests\n", testclass.getSimpleName(), count);
		List<Failure> failures = result.getFailures();
		// this doesn't seem to return all the failures
		for(Failure f: failures) {
			Description d = f.getDescription();
			System.out.println( f.getTestHeader() +": "+ f.getMessage() );
			System.out.println( d.getDisplayName() );
		}
		System.out.printf("%s: Success %d Failure %d\n",
				testclass.getSimpleName(), count-failed, failed);
	}
	
	
	/** Run a test suite and describe the results. */
	public static void main(String[] args) {
		runTests( EasyCSVReaderTest.class );
		runTests( BigCSVReaderTest.class );
	}
}
