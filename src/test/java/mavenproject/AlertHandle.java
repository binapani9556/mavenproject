package mavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlibrary.BaseClass;
import com.actitime.genericlibrary.WebDriverCommonUtils;

public class AlertHandle extends BaseClass{

	@Test
	public void chaangeGeneralSettingAlertHandle() throws Throwable {

	
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("popup_menu_item_6")).click();		
		WebElement actitime = driver.findElement(By.xpath("//td[text()='General Settings']"));
		
		
		WebElement topGroupingLevelWebElement = driver.findElement(By.xpath("//select[@id=\"firstHierarchyLevelCodeSelect\"]"));
		WebDriverCommonUtils webDriverCommonUtil = new WebDriverCommonUtils();
		webDriverCommonUtil.selectText(topGroupingLevelWebElement, "Product");
		
		WebElement middleGroupingLevelElement = driver.findElement(By.xpath("//select[@id=\"secondHierarchyLevelCodeSelect\"]"));
		webDriverCommonUtil.selectText(middleGroupingLevelElement, "Product");
		
		WebElement modifiationNotSaveWbElement = driver.findElement(By.xpath("//td[@id=\"FormModifiedTextCell\"]"));
		String modifiationNotSave = modifiationNotSaveWbElement.getText();
		boolean displayed = modifiationNotSaveWbElement.isDisplayed();
		if(displayed) {
			System.out.println("displayed message is:"+modifiationNotSave);
		}
		Assert.assertEquals(modifiationNotSave, "MODIFICATIONS NOT SAVED");
		
	
		
		
		
	}



}
