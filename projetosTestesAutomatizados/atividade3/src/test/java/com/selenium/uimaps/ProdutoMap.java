package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class ProdutoMap {
	WebDriver driver;

	public ProdutoMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element linkProduto= new Element(driver, ByValue.XPATH, "//a[text()='Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite']");
	
	
}
