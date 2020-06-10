package com.selenium.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium.core.Driver;
import com.selenium.pages.InicioPage;
import com.selenium.pages.VoosPage;
import com.selenium.pages.ConfirmationPage;
import com.selenium.pages.FormularioPage;

public class CT03 {
	/*
	 * Etapas do Caso de Teste 3 (CT03)
	 * 1 - Acessar o site: https://blazedemo.com/
	 * 2 - Em select “Choose your departure city:” selecionar qualquer valor passado por parâmetro
	 * 3 - Em select “Choose your destination city:” selecionar qualquer valor passado por parâmetro
	 * 4 - Clicar em “Find Flights”.
	 * 5 - Escolher a viagem baseada no “Flight#”, ou seja clicar no botão “Choose This Flight” do “Flight#” passado por parâmetro
	 * 6 - Preencher todos os campos do formulário (passar as informações por parâmetro)
	 * 7 - Enviar (Purchase Flight) o formulário
	 * 8 - Validar mensagem de sucesso
	 */
	
	/*Declaração de Variáveis*/
	
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
	VoosPage voosPage;
	ConfirmationPage confirmationPage;
	
	String decolagem;
	String aterrisagem;
	
	String nome;
	String endereco;
	String cidade;
	String estado;
	String codigo;
	int tipoCartao;
	String numeroCartao;
	String mes;
	String ano;
	String nomeCartao;
	int voo;
	
	
	/**
	 * Construtor que permite parametrizar o código.
	 * @param decolagem - [String]
	 * @param aterrisagem - [String]
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
	 * @param voo - [int]
	 */
	public CT03(String decolagem, String aterrisagem, String nome, String endereco, String cidade, String estado,
			String codigo, int tipoCartao, String numeroCartao, String mes, String ano, String nomeCartao, int voo) {
		this.decolagem = decolagem;
		this.aterrisagem = aterrisagem;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.codigo = codigo;
		this.tipoCartao = tipoCartao;
		this.numeroCartao = numeroCartao;
		this.mes = mes;
		this.ano = ano;
		this.nomeCartao = nomeCartao;
		this.voo = voo;
	}

	@Before 
	public void before() {	
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
		voosPage = new VoosPage(driver);
		confirmationPage = new ConfirmationPage(driver);
	}
	
	@Test
	public void test() {
		
		inicioPage.selecionarViagemOp(this.decolagem,this.aterrisagem);
		voosPage.selecionarVoo(voo);
		formularioPage.preencherFormularioOp(this.nome,this.endereco,this.cidade,this.estado,this.codigo,this.tipoCartao,this.numeroCartao,this.mes,this.ano,this.nomeCartao);
		confirmationPage.validarExercicio2();
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
