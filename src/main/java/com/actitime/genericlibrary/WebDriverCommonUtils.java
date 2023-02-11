package com.actitime.genericlibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonUtils {
	public void selectText(WebElement element, String data ) {
		Select sel = new Select(element);
		sel.selectByVisibleText(data);
	}
	
	//=DI======== i love baba ====================================gudi is my name

}
