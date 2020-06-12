package com.selenium.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.junit.Assert;


public class ValidarPrecosCepPage {
	WebDriver driver;

	public ValidarPrecosCepPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public List<WebElement> precos;
	
	/**
	 * Usa uma lista de elementos web (List<WebElement> precos) para 
	 * armazenar todos os preços que apareceram.
	 */
	public void pegarPrecos(){
		precos =  driver.findElements(By.xpath("//tbody[@id = 'table-calcular']/tr/td[3]"));
	}
	
	
	/**
	 * O vetor de string "esperado" contém os preços esperados do frete 
	 * Cada preço em "esperado" é comparado com o preço obtido no site ("precos")
	 * caso sejam iguais, tanto em valor quanto em ordem, o teste é um sucesso, 
	 * caso exista algum diferente o teste falha.
	 * 
	 * @param esperado - Lista de String contendo cada preço
	 */
	public void validar(ArrayList<String> esperado){
		//String[] esperado = {"R$ 23,39", "R$ 40,97", "R$ 51,79"};
		
		
		
		if (esperado.size() > precos.size()) {
			System.out.println("Aparecem menos preços na tela do que deveria");
		}
		if (esperado.size() < precos.size()) {
			System.out.println("Aparecem mais preços na tela do que deveria");
		}
	
		for (int i=0; i< precos.size();i++) {
			Assert.assertEquals("Preço não cadastrado",esperado.get(i), precos.get(i).getText());
		}
		System.out.println("Todos os preços validados com sucesso!");
	}
	
	
	/*
	 * Função que não se importa com a ordem que os preços estão armazenados
	 * essa função faz a comparação de todos os elemetos de "esperado"
	 * com todos os elementos de "precos"
	 * 
	public void validar(){
		String[] esperado = {"R$ 23,39", "R$ 40,97", "R$ 51,79"};
		boolean flag = false;
		for (String e: esperado) {
			for (WebElement p: precos) {
				if (e.equalsIgnoreCase(p.getText())) {
					System.out.println("Preço: "+e+" validado com sucesso");
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("Preço: "+e+" não consta na exibição da página");
			flag = false;
		}
		
	}*/

	
}
