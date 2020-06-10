package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class DetalhesMap {
	WebDriver driver;

	public DetalhesMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element cep= new Element(driver, ByValue.XPATH, "//input[@id='calc_cep']");
	public Element btnCep= new Element(driver, ByValue.XPATH, "//input[@value='Calcular Frete']");
	
	
}
