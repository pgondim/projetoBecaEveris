package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element buscar= new Element(driver, ByValue.XPATH, "//form[@id='form-busca']/input[@class='sprocura']");
	public Element btnBuscar= new Element(driver, ByValue.XPATH, "//form[@id='form-busca']/input[@id='bt-busca']");
	
	/*
	public Element btnViewDemo(String nomeCard) {
		return new Element(driver, ByValue.XPATH, "(//a[text() = '"+nomeCard+"']//following::a[text()='View Demo'])[1]");
	}
	*/
}
