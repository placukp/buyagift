package co.uk.buyagift.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestPostCodeSearch extends BaseTest {
	
	@Test
	public void postcodeTest() {
		
		driver.findElement(By.id(OR.getProperty("postCodeField"))).click();
		driver.findElement(By.id(OR.getProperty("postCodeField"))).sendKeys(config.getProperty("postcode"));
		driver.findElement(By.xpath(OR.getProperty("searchBtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("chooseAddressField"))).click();
		new Select(driver.findElement(By.xpath(OR.getProperty("addressDropdown")))).selectByVisibleText(config.getProperty("adress"));
		driver.findElement(By.xpath(OR.getProperty("addressDropdown"))).click();	

	}

}
