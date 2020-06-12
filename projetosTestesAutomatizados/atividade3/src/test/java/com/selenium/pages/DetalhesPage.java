package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.DetalhesMap;

public class DetalhesPage {
	WebDriver driver;

	public DetalhesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	DetalhesMap detalhesMap = new DetalhesMap(driver);
	
	/**
	 * Clica no campo do cep, pois ele estava indo errado
	 * quando apenas enviava o valor do cep.
	 * Depois de clicar é enviado o valor do cep.
	 * E por fim o botão de calcular frete é clicado.
	 * 
	 * @param cep - [String] Ex: "38413108"
	 */
	public void preencherCep(String cep){
		detalhesMap.cep.click(driver);
		detalhesMap.cep.sendKey(driver, cep);
		detalhesMap.btnCep.click(driver);
	}
	
}
