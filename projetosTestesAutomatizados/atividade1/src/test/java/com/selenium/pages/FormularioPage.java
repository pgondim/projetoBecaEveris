package com.selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.FormularioMap;

public class FormularioPage {
	
	WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	/**Recebe o campo do formulário especificado no formulárioMap.
	 * Caso seja input de click a ação é chamada.
	 * Caso seja text-area é enviado o a string para preencher o 
	 * campo de texto
	 * */
	public void preencherFormulario() {
		
		formularioMap.radio1.click(driver);
		formularioMap.text1.sendKey(driver, "Se você não participa de eventos neste bairro, por que não?");
		formularioMap.text2.sendKey(driver, "Que tipos de eventos você participaria se fossem realizados nesse bairro?");
		formularioMap.radio2.click(driver);
		formularioMap.text3.sendKey(driver, "Se você não participa de atividades neste bairro, por que não?");
		formularioMap.text4.sendKey(driver, "Que tipos de eventos você participaria se fossem realizados nesse bairro?");
		formularioMap.btnSubmit.click(driver);
	}
	
	/**A espera é acionada até que o título  da mensagem seja visivel na tela.
	 * Assim que o título da mensagem se torna visivel a variavel "resultado"
	 * recebe o texto descrito dentro do botão que apareceu junto com a mensagem.
	 * O texto do botão que apareceu é então comparado com o texto esperado. 
	 * caso afirmativo, teste realizado com sucesso Caso contrário, teste
	 * falhou.
	 * */
	public void validarMensagemSucesso() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(formularioMap.tituloMensagem.getValue()))));
			String resultado = driver.findElement(By.xpath(formularioMap.btnMensagem.getValue())).getText();
			
			
			Assert.assertEquals("Erro ao validar botão da mensagem de sucesso!","Get Started with WPForms Today", resultado);
			System.out.println("Página Validada com Sucesso!");
		}catch(Exception e) {
			System.out.println("Falha!");
		}
	}

}
