package com.selenium.pages;

import org.openqa.selenium.WebDriver;


import com.selenium.uimaps.FormularioMap;

public class FormularioPage {
	
	WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	/**
	 * Preenchimento do formulário com 
	 * dados estáticos
	 */
	public void preencherFormulario() {
		
		formularioMap.inputName.sendKey(driver, "Pedro");
		formularioMap.inputAdress.sendKey(driver, "Avenida Qualquer");
		formularioMap.inputCity.sendKey(driver, "Uberlândia");
		formularioMap.inputState.sendKey(driver, "Minas Gerais");
		formularioMap.inputCode.sendKey(driver, "12345");
		formularioMap.selectCard.select(driver,"Diner's Club" );
		formularioMap.inputCardNumber.sendKey(driver, "12345");
		
		//Deixa o campo sem nenhum valor
		//Foi necessário pois o conteúdo enviado
		//Esava sendo concatenado ao conteúdo que já estava
		//no campo.
		formularioMap.inputCardMonth.limpar(driver);
		formularioMap.inputCardMonth.sendKey(driver, "06");
		
		//Deixa o campo sem nenhum valor
		//Foi necessário pois o conteúdo enviado
		//Esava sendo concatenado ao conteúdo que já estava
		//no campo.
		formularioMap.inputCardYear.limpar(driver);
		formularioMap.inputCardYear.sendKey(driver, "2020");
		formularioMap.inputNameOnCard.sendKey(driver, "Pedro Gondim");
		formularioMap.inputRememberMe.click(driver);
		formularioMap.btnComprar.click(driver);
	}
	/**
	 * Preenchimento do formulário com dados dinâmicos e parametrizados.
	 * 
	 * @param nome - [String]
	 * @param endereco - [String]
	 * @param cidade - [String]
	 * @param estado - [String]
	 * @param codigo - [String]
	 * @param tipoCartao - [int]
	 * @param numeroCartao - [String]
	 * @param mes - [String]
	 * @param ano - [String]
	 * @param nomeCartao - [String]
	 */
	public void preencherFormularioOp(String nome,String endereco,String cidade,String estado,String codigo,int tipoCartao,String numeroCartao,String mes,String ano,String nomeCartao) {
		
		formularioMap.inputName.sendKey(driver, nome);
		formularioMap.inputAdress.sendKey(driver, endereco);
		formularioMap.inputCity.sendKey(driver, cidade);
		formularioMap.inputState.sendKey(driver, estado);
		formularioMap.inputCode.sendKey(driver, codigo);
		
		if (tipoCartao==1) {
			formularioMap.selectCard.select(driver,"Visa" );
		}else if (tipoCartao==2) {
			formularioMap.selectCard.select(driver,"American Express" );
		}else if (tipoCartao==3) {
			formularioMap.selectCard.select(driver,"Diner's Club" );
		}
		
		formularioMap.inputCardNumber.sendKey(driver,numeroCartao);
		
		//Deixa o campo sem nenhum valor
		//Foi necessário pois o conteúdo enviado
		//Esava sendo concatenado ao conteúdo que já estava
		//no campo.
		formularioMap.inputCardMonth.limpar(driver);
		formularioMap.inputCardMonth.sendKey(driver, mes);
		
		//Deixa o campo sem nenhum valor
		//Foi necessário pois o conteúdo enviado
		//Esava sendo concatenado ao conteúdo que já estava
		//no campo.
		formularioMap.inputCardYear.limpar(driver);
		formularioMap.inputCardYear.sendKey(driver, ano);
		formularioMap.inputNameOnCard.sendKey(driver, nomeCartao);
		formularioMap.inputRememberMe.click(driver);
		formularioMap.btnComprar.click(driver);
	}
	
	
	

}
