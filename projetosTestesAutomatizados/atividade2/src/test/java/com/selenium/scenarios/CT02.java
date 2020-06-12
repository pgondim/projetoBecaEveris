package com.selenium.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium.core.Driver;
import com.selenium.pages.InicioPage;
import com.selenium.pages.VoosPage;
import com.selenium.pages.ConfirmationPage;
import com.selenium.pages.FormularioPage;

public class CT02 {
	/*
	 * Etapas do Caso de Teste 2 (CT02)
	 * 1 - Acessar o site: https://blazedemo.com/
	 * 2 - Em select “Choose your departure city:” selecionar “San Diego”.
	 * 3 - Em select “Choose your destination city:” selecionar “New York”.
	 * 3 - Clicar em “Find Flights”.
	 * 4 - Escolher a primeira viagem, ou seja clicar no primeiro botão “Choose This Flight”
	 * 5 - Preencher todos os campos do formulário
	 * 5 - Enviar (Purchase Flight) o formulário
	 * 6 - Validar mensagem de sucesso
	 */
	
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
	VoosPage voosPage;
	ConfirmationPage confirmationPage;
	
	
	@Before 
	public void before() {	
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
		voosPage = new VoosPage(driver);
		confirmationPage = new ConfirmationPage(driver);
		
	}
	
	@Test
	public void test() {
		
		inicioPage.selecionarViagem();
		
		voosPage.selecionarPrimeiroVoo();
		
		formularioPage.preencherFormulario();
		
		confirmationPage.validarExercicio2();
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
