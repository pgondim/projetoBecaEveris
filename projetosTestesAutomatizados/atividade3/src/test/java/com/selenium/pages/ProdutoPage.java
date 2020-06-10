package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.ProdutoMap;

public class ProdutoPage {
	WebDriver driver;

	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ProdutoMap produtoMap = new ProdutoMap(driver);
	
	/**
	 * Apenas clica no elemento que aparece como produto, e vai 
	 * para a página de detalhe do produto.
	 */
	public void acessarProduto() {
		produtoMap.linkProduto.click(driver);
	}
	
	
}
