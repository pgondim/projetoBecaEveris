package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.InicioMap;

public class InicioPage {
	
	WebDriver driver;
	
	
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}

	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarTipoFormulario() {
		
		//Em inicioMap tem o elemento input que é a entrada da busca, por isso conseguimos enviar e buscar a string "Feedback"
		inicioMap.selectTipoFormulario.select(driver, "Feedback");
		
		/*Descrição:
		 * 
		 * Em inicioMap tem o elemento link, o qual está dentro de um card.
		 * Cada card é diferenciado pelo seu nome. 
		 * 
		 * Passamos então o nome de um card específico
		 * (nesse caso "Neighborhood Events Questionnaire Form Demo")
		 * e o link "View Demo" fica vinculado ao btnViewDemo
		 */
		inicioMap.btnViewDemo("Neighborhood Events Questionnaire Form Demo").click(driver);
		
	}
}
