package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element selectDecolagem = new Element(driver, ByValue.XPATH, "//select[@name='fromPort']");
	public Element selectAterrisagem = new Element(driver, ByValue.XPATH, "//select[@name='toPort']");
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//input[@value='Find Flights']");
	
}
