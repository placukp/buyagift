package co.uk.buyagift.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestBasket extends BaseTest {
	
	
	@Test(priority=1)
	public void addTestBasket() {
			
		driver.findElement(By.cssSelector(OR.getProperty("basketSummary")));
		
		assertEquals(driver.findElement(By.cssSelector(OR.getProperty("basketItemTotal"))).getText(),config.getProperty("productPriceBasketSummary"));
		
		log.debug("Prouct is in the basket OK");
		
	}
	
	@Test(priority=2)
	public void addPeronalMessage() {
		
		driver.findElement(By.xpath(OR.getProperty("personalizedMsg"))).sendKeys(config.getProperty("message"));
		
		log.debug("Personalized Msg added OK");
		
	}

}
