package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.InicioMap;

public class InicioPage {
	
	WebDriver driver;
	
	
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}

	InicioMap inicioMap = new InicioMap(driver);
	
	/**
	 * Passa o item como valoor do elemento input buscar.
	 * Clica no botão para pesquisar.
	 * 
	 * @param produto - [String] Ex: "Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite"
	 */
	public void procurarCompra(String produto) {
		inicioMap.buscar.sendKey(driver, produto);
		inicioMap.btnBuscar.click(driver);
	}
}
