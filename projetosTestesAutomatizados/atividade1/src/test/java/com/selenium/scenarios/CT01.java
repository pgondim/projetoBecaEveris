package com.selenium.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium.core.Driver;
import com.selenium.pages.FormularioPage;
import com.selenium.pages.InicioPage;

public class CT01 {
	/*
	 * Etapas do Caso de Teste 1 (CT01)
	 * 1 - Acessar o site: https://wpforms.com/demo/
	 * 2 - No select “Viewing All Templates” selecionar “FeedBack”
	 * 3 - Clicar em “View Demo” do card “Neighborhood Events Questionnaire Form Demo”
	 * 4 - Preencher todos os campos (radio button e textbox) do formulário com qualquer valor.
	 * 5 - Enviar (Submit) o formulário
	 * 6 - Validar que foi o formulário foi enviado.
	 */
	
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
	
	
	
	@Before 
	public void before() {	
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://wpforms.com/demo");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
		
	}
	
	@Test
	public void test() {
		
		//seleciona qual formulário quer preencher
		//e clica no botão "View Demo" de um card
		inicioPage.selecionarTipoFormulario();
		
		//preenche o formulário e clica botão submit
		formularioPage.preencherFormulario();
		
		//valída se a saída produzida é igual a esperada
		formularioPage.validarMensagemSucesso();
		
		try {
			Thread.sleep(3000);
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
