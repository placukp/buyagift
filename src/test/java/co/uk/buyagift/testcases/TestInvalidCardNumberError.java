package co.uk.buyagift.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestInvalidCardNumberError extends BaseTest {
	
	@Test
	public void testPaymentDetails() {
		
		driver.findElement(By.id(OR.getProperty("cardholderNameField"))).sendKeys((config.getProperty("firstName")+" "+config.getProperty("lastName")));
		driver.findElement(By.id(OR.getProperty("cardNumberField"))).sendKeys(config.getProperty("cardNumber"));
	    driver.findElement(By.id(OR.getProperty("expiryMonthField"))).click();
	    new Select(driver.findElement(By.id(OR.getProperty("expiryMonthField")))).selectByVisibleText(config.getProperty("expiryMonth"));
	    driver.findElement(By.id(OR.getProperty("expiryMonthField"))).click();
	    driver.findElement(By.id(OR.getProperty("expiryYearField"))).click();
	    new Select(driver.findElement(By.id(OR.getProperty("expiryYearField")))).selectByVisibleText(config.getProperty("expiryYear"));
	    driver.findElement(By.id(OR.getProperty("expiryYearField"))).click();
	    driver.findElement(By.id(OR.getProperty("cvvField"))).click();
	    driver.findElement(By.id(OR.getProperty("cvvField"))).sendKeys(config.getProperty("cvv"));
	    driver.findElement(By.xpath(OR.getProperty("placeOrderBtn"))).click();
	    driver.findElement(By.xpath("//*[@id=\"chk_step3\"]/div[1]/span"));

	    assertEquals(driver.findElement(By.xpath(OR.getProperty("error"))).getText(), config.getProperty("invalidCardNumberError"));
		
	    log.debug("Invalid card number error displayed OK");

	}

}
