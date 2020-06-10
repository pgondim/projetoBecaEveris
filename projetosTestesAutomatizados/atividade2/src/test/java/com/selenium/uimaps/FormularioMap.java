package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class FormularioMap {
	
	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Formulario para caso de teste 2
	public Element inputName = new Element(driver, ByValue.ID, "inputName");
	public Element inputAdress = new Element(driver, ByValue.ID, "address");
	public Element inputCity = new Element(driver, ByValue.ID, "city");
	public Element inputState = new Element(driver, ByValue.ID, "state");
	public Element inputCode = new Element(driver, ByValue.ID, "zipCode");
	public Element selectCard = new Element(driver, ByValue.ID, "cardType");
	public Element inputCardNumber = new Element(driver, ByValue.ID, "creditCardNumber");
	public Element inputCardMonth = new Element(driver, ByValue.ID, "creditCardMonth");
	public Element inputCardYear = new Element(driver, ByValue.ID, "creditCardYear");
	public Element inputNameOnCard = new Element(driver, ByValue.ID, "nameOnCard");
	public Element inputRememberMe = new Element(driver, ByValue.ID, "rememberMe");
	public Element btnComprar = new Element(driver, ByValue.XPATH, "//input[@value='Purchase Flight']");

}
