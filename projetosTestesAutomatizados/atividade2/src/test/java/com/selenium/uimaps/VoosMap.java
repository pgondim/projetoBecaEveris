package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class VoosMap {
	WebDriver driver;
	

	public VoosMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//Tabela para caso de teste1 
	public Element thDeparts = new Element(driver, ByValue.XPATH, "//th[text()='Departs: San Diego']");
	public Element thArrives = new Element(driver, ByValue.XPATH, "//th[text()='Arrives: New York']");
	public Element primeiroVoo = new Element(driver, ByValue.XPATH, "(//input[@value='Choose This Flight'])[1]");
	public Element vooHigor = new Element(driver, ByValue.XPATH, "//td[text()='43']//preceding::input[@value='Choose This Flight']");
	
	/*
	public Element btnVoo(int  voo) {
		return new Element(driver, ByValue.XPATH, "(//input[@value='Choose This Flight'])["+String.valueOf(voo)+"]");
	}
	*/
	
	
	
	public Element btnVoo(String  voo) {
		return new Element(driver, ByValue.XPATH, "//td[text()='"+voo+"']//preceding-sibling::td/input");
	}
	
	
	
}
