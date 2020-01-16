package co.uk.buyagift.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestPurchaseAsGuest extends BaseTest {
	
	@Test
	public void testPurchaseAsGuest() {
		
		driver.findElement(By.cssSelector(OR.getProperty("paySecurelyNowBtn"))).click();
		driver.findElement(By.id(OR.getProperty("emailField")));
	    driver.findElement(By.id(OR.getProperty("emailField"))).click();
	    driver.findElement(By.id(OR.getProperty("emailField"))).sendKeys(config.getProperty("email"));
	    driver.findElement(By.xpath(OR.getProperty("continueAsGuestBtn"))).click();
	    driver.findElement(By.id(OR.getProperty("titleField"))).click();
	    new Select(driver.findElement(By.id(OR.getProperty("titleField")))).selectByVisibleText(config.getProperty("title"));
	    driver.findElement(By.id(OR.getProperty("firstNameField"))).sendKeys(config.getProperty("firstName"));
	    driver.findElement(By.id(OR.getProperty("lastNameField"))).sendKeys(config.getProperty("lastName"));
	    driver.findElement(By.xpath(OR.getProperty("continueBtn"))).click();
	    
	    log.debug("Personal details added OK");

	}

}
