package com.selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.ConfirmationMap;

public class ConfirmationPage {
	WebDriver driver;
	
	ConfirmationMap confirmationMap = new ConfirmationMap(driver);

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Espera até que a tag h1 da mensagem de êxito 
	 * esteja visivel na tela. Armazena na variável
	 * resultado o conteúdo do texto da tag h1.
	 * Compara esse resultado com o texto esperado
	 * caso sejam iguais o teste foi bem sucedido
	 * caso contrário, não.
	 */
	public void validarExercicio2() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(confirmationMap.h1.getValue()))));
			String resultado = driver.findElement(By.xpath(confirmationMap.h1.getValue())).getText();
			
			Assert.assertEquals("Erro ao validar Mensagem de Compra Bem sucedida","Thank you for your purchase today!", resultado);
			System.out.println("Página de Confirmação da Compra Testada com Sucesso!");
		}catch(Exception e) {
			System.out.println("Falha!");
		}
	}
	
	
}
