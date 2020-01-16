package co.uk.buyagift.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.uk.buyagift.base.BaseTest;

public class TestEVoucher extends BaseTest {
	
	@Test
	public void testEvoucher() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("deliveryDropdown"))).click();
		driver.findElement(By.xpath(OR.getProperty("E-voucher"))).click();
		
		Thread.sleep(500);

		assertEquals(driver.findElement(By.xpath((OR.getProperty("deliveryCharge")))).getText(), config.getProperty("EvoucherCost"));
		assertEquals(driver.findElement(By.xpath((OR.getProperty("totalCost")))).getText(), config.getProperty("productPriceBasketSummary"));
		
		log.debug("EVoucher test OK");
		

	}

}
