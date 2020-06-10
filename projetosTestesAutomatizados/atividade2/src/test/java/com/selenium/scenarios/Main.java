package com.selenium.scenarios;

public class Main {

	/*Main para chamar classe CT03 e iniciar o teste*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ordem: Origem, destino, nome, rua, cidade, estado, codigo postal, tipo cartao (em int), numero cartao, mes, ano, nome cartao, selecionar voo 
		CT03 t = new CT03("Boston","Rome", "Pedro", "Avenida da rua", "Uberlândia", "Minas Gerais", "123", "American Express", "456", "06", "2020", "Pedro Gondim", "43");
		t.before();
		t.test();
		t.after();
	}

}
