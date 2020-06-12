package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//armazena o input do "buscar"
	public Element selectTipoFormulario = new Element(driver, ByValue.XPATH, "//div[@class='nav']/select");
	
	/**
	 * Após o nome do card ser passado, é possível 
	 * criar o elemento do link a partir dessa função
	 * 
	 * @param nomeCard - nome do card que quer acessar.
	 * @return elemento que possui o link para "View Demo"
	 */
	public Element btnViewDemo(String nomeCard) {
		return new Element(driver, ByValue.XPATH, "(//a[text() = '"+nomeCard+"']//following::a[text()='View Demo'])[1]");
	}
}
