package com.selenium.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium.core.Driver;
import com.selenium.pages.InicioPage;
import com.selenium.pages.VoosPage;
import com.selenium.pages.FormularioPage;

public class CT01 {
	/*
	 * Etapas do Caso de Teste 1 (CT01)
	 * 1 - Acessar o site: https://blazedemo.com/
	 * 2 - No select “Choose your departure city:” selecionar “San Diego”.
	 * 3 - No select “Choose your destination city:” selecionar “New York”.
	 * 4 - Clicar em “Find Flights”.
	 * 5 - Validar se no cabeçalho da tabela tem as informações: "Departs: San Diego" e "Arrives: New York"
	 */
	
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
	VoosPage voosPage;
	
	
	
	@Before 
	public void before() {	
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
		voosPage = new VoosPage(driver);
		
	}
	
	@Test
	public void test() {
		
		/*
		 * Seleciona as cidades de origem e destino
		 * clica no botão para pesquisar os voos
		 * e é redirecionado para a página de voos.
		 */
		inicioPage.selecionarViagem(); 
		
		/*
		 * Valida se os campos Departs e Arrives do
		 * cabeçalho da tabela, contém os valores
		 * "Departs: San Diego" e "Arrives: New York"
		 */
		voosPage.validarCT01();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@After
	public void after() {
		Driver.fechar(driver);
	}
	
	
	
}
