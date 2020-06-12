package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.InicioMap;

public class InicioPage {
	
	WebDriver driver;
	
	/**Construtor da classe InicioPage
	 * 
	 * @param driver - o driver que será associado
	 * 
	 */
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}

	InicioMap inicioMap = new InicioMap(driver);
	
	/**
	 * Usa o elemento do tipo seletor tanto pra selecionar a cidade de origem
	 * quanto a cidade de destino. O btnSubmit é clicado depois que os
	 * dois campos seletores estão preenchidos. Quando clicado, redireciona
	 * o usuário para outra página.
	 */
	
	public void selecionarViagem() {
		inicioMap.selectDecolagem.select(driver, "San Diego");
		inicioMap.selectAterrisagem.select(driver, "New York");
		inicioMap.btnSubmit.click(driver);
	}
	
	/**
	 * Usa o elemento do tipo seletor tanto pra selecionar a cidade de origem
	 * quanto a cidade de destino. O btnSubmit é clicado depois que os
	 * dois campos seletores estão preenchidos. Quando clicado, redireciona
	 * o usuário para outra página
	 * 
	 * @param decolagem - [String] recebe a cidade de origem
	 * @param aterrisagem - [String] recebe a cidade de destino
	 */
	
	public void selecionarViagemOp(String decolagem, String aterrisagem) {
		inicioMap.selectDecolagem.select(driver, decolagem);
		inicioMap.selectAterrisagem.select(driver, aterrisagem);
		inicioMap.btnSubmit.click(driver);
	}
}
