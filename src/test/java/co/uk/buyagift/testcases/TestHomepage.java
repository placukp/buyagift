package co.uk.buyagift.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestHomepage extends BaseTest{
	
	@Test
	public void testHomepageTitle() throws InterruptedException {
		
		assertEquals(driver.getTitle(),OR.getProperty("homepageTitle"));
		
		log.debug("Homepage opened OK");
		
	}
	

}
