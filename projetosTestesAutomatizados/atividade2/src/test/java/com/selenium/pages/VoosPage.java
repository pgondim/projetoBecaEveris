package com.selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.VoosMap;

public class VoosPage {
	
	WebDriver driver;

	public VoosPage(WebDriver driver) {
		this.driver = driver;
	}
	
	VoosMap voosMap = new VoosMap(driver);
	
	
	/**Método que valida o Caso de Teste 1.
	 * Verifica se o cabeçalho Departs e Arrives estão
	 * de acordo com o especificado. Com funciona: Espera até que o
	 * elemento Departs seja vizível na tela. Armazena 
	 * em uma variável cada texto escrito, tanto no campo
	 * Departs quanto no campo Arrives. 
	 * Compara a String esperada com o resultado obtido nas variáveis, 
	 * caso esteja igual, o teste foi realizado com sucesso,
	 * caso não esteja, o teste falhou. 
	 */
	public void validarCT01() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(voosMap.thDeparts.getValue()))));
			String resultadoDeparts = driver.findElement(By.xpath(voosMap.thDeparts.getValue())).getText();
			String resultadoArrives = driver.findElement(By.xpath(voosMap.thArrives.getValue())).getText();
			//System.out.println(resultadoDeparts);
			
			Assert.assertEquals("Erro ao validar 'Departs: San Diego'","Departs: San Diego", resultadoDeparts);
			Assert.assertEquals("Erro ao validar 'Arrives: New York'","Arrives: New York", resultadoArrives);
			System.out.println("Cabeçalho Departs e Arrives de acordo com o especificado. \n\nTeste concluído com Sucesso!");
		}catch(Exception e) {
			System.out.println("Falha!");
		}
	}
	
	
	/**
	 * Passo 4, CT02. Clica no primeiro 
	 * botão de cima para baixo que 
	 * aparece na tabela de voos
	 */
	public void selecionarPrimeiroVoo() {
		voosMap.primeiroVoo.click(driver);
	}
	
	/**
	 * Passo 5, CT03. Seleciona qual dos 
	 * voos quer usar a partir do parâmetro, 
	 * depois clica no voo escolhido.
	 * 
	 * @param voo - [int] Número do voo que desejar
	 */
	public void selecionarVoo(String voo) {
		voosMap.btnVoo(voo).click(driver);
	}
	
	

}
