package co.uk.buyagift.listeners;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import co.uk.buyagift.utilities.TestUtil;

import co.uk.buyagift.base.BaseTest;

public class CustomListeners extends BaseTest implements ITestListener,ISuiteListener {

	static Date d = new Date();
	static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	static String messageBody;

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reporting.escape-output", "false");
		String excepionMessage=Arrays.toString(result.getThrowable().getStackTrace());
		Reporter.log(excepionMessage);
		
		try {

			TestUtil.captureScreenshot();
			Reporter.log("Capturing screenshot");
			Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
			Reporter.log("<br>");
			Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+"></img></a>");

		} catch (IOException e) {

		};
	}
}
