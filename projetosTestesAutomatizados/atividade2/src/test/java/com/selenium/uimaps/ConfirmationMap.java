package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class ConfirmationMap {
	WebDriver driver;

	public ConfirmationMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//Mensagem compra bem suceddida
	public Element h1 = new Element(driver, ByValue.XPATH, "//h1[text()='Thank you for your purchase today!']");
	
	
	
}
