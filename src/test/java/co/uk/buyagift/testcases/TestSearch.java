package co.uk.buyagift.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestSearch extends BaseTest {
	
	@Test
	public void searchForProduct() throws InterruptedException {
		
		
		driver.findElement(By.id(OR.getProperty("searchField"))).click();
		driver.findElement(By.id(OR.getProperty("searchField"))).sendKeys(config.getProperty("product"));
		driver.findElement(By.id(OR.getProperty("searchIcon"))).click();
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("productOfIntrest"))));
		
		log.debug("Product search OK");
		
	}
		


}
