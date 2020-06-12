package com.selenium.scenarios;

import java.util.ArrayList;
import java.util.Arrays;
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
	 * 1 -	Acessar o site: https://www.kabum.com.br/
	 * 2-	No input “buscar”, pesquisar: Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite
	 * 3-	Clicar em “Buscar”
	 * 4-	Clicar no Link do produto pesquisado
	 * 5-	No campo “Digite seu CEP” preencher com o CEP: 38413-108
	 * 6-	Clicar em “Calcular Frete”
	 * 7-	Validar se os 4 valores de frete são: "R$ 23,39", "R$ 40,97", "R$ 51,79"
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
		String produto = "Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite";
		inicioPage.procurarCompra(produto);
		
		//passar o nome do produto
		produtoPage.acessarProduto(produto);
		
		//passar o cep ex: "38413108"
		detalhesPage.preencherCep("38413108");
		
		/*espera para os itens aparecerem na tela*/
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		validarPrecosCepPage.pegarPrecos();
		
		//passar os preços
		validarPrecosCepPage.validar(new ArrayList<String>(Arrays.asList("R$ 23,17","R$ 40,75", "R$ 51,67")) );
		
		
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
