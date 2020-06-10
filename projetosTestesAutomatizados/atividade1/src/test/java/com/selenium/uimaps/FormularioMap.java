package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class FormularioMap {
	
	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elementos do formulario
	public Element radio1 = new Element(driver, ByValue.XPATH, "(//label[text()='How often do you attend events in this neighborhood?']/../ul/li)[2]/input");
	public Element text1 = new Element(driver, ByValue.ID, "wpforms-260271-field_2");
	public Element text2 = new Element(driver, ByValue.ID, "wpforms-260271-field_3");
	public Element radio2 = new Element(driver, ByValue.XPATH, "(//label[text()='How often do you participate in activities in this neighborhood?']/../ul/li)[1]/input");
	public Element text3 = new Element(driver, ByValue.ID, "wpforms-260271-field_5");
	public Element text4 = new Element(driver, ByValue.ID, "wpforms-260271-field_6");
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//button[text()='Submit']");
	
	
	
	//Elementos da mensagem de confirmação
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
	public Element btnMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']/..//a[@class='button']");

}
