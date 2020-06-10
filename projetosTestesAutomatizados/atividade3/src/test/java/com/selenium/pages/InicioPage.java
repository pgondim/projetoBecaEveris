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
	 */
	public void procurarCompra() {
		inicioMap.buscar.sendKey(driver, "Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite");
		inicioMap.btnBuscar.click(driver);
	}
}
