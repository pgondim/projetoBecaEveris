package com.selenium.scenarios;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.core.Driver;
import com.selenium.pages.DetalhesPage;
import com.selenium.pages.InicioPage;
import com.selenium.pages.ProdutoPage;
import com.selenium.pages.ValidarPrecosCepPage;

public class CT01 {
	/*
	 * Etapas do Caso de Teste 1 (CT01)
	 * 1-	Acessar o site: https://www.kabum.com.br/
	 * 2-	No input “buscar”, pesquisar: Mouse Logitech M90 Preto 1000DPI - 910-004053
	 * 3-	Clicar em “Buscar”
	 * 4-	Clicar no Link do produto pesquisado
	 * 5-	No campo “Digite seu CEP” preencher com o CEP: 38413-108
	 * 6-	Clicar em “Calcular Frete”
	 * 7-	Validar se os 4 valores de frete: "R$ 20,59", "R$ 21,75", "R$ 39,27", "R$ 50,89"
	 */
	
	WebDriver driver;
	InicioPage inicioPage;
	ProdutoPage produtoPage;
	DetalhesPage detalhesPage;
	ValidarPrecosCepPage validarPrecosCepPage;
	List<WebElement> precos;
	
	
	@Before 
	public void before() {	
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://www.kabum.com.br/");
		inicioPage = new InicioPage(driver);
		produtoPage = new ProdutoPage(driver);
		detalhesPage = new DetalhesPage(driver);
		validarPrecosCepPage = new ValidarPrecosCepPage(driver);
	}
	
	@Test
	public void test() {
		
		inicioPage.procurarCompra();
		
		produtoPage.acessarProduto();
		
		detalhesPage.preencherCep();
		
		/*espera para os itens aparecerem na tela*/
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		validarPrecosCepPage.pegarPrecos();
		validarPrecosCepPage.validar();
		
		
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
