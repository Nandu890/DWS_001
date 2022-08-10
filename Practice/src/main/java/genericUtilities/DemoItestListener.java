package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DemoItestListener  implements ITestListener {

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test is Failed",true);
		}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("Test is Started",true);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("Test is Finished",true);
	}
	

}
