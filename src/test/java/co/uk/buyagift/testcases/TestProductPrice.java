package co.uk.buyagift.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestProductPrice extends BaseTest{
	
	@Test
	public void selectProduct() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("productOfIntrest"))).click();
		driver.findElement(By.id(OR.getProperty("productCurrentPrice")));

		assertEquals(driver.getTitle(),OR.getProperty("productPageTitle"));
		assertEquals(driver.findElement(By.id(OR.getProperty("productCurrentPrice"))).getText(),config.getProperty("productPrice"));
		driver.findElement(By.cssSelector(OR.getProperty("buyNowButton"))).click();
		
		log.debug("Prouct price OK");
		
	}

}
