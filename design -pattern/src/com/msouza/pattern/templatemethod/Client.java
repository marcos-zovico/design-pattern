package com.msouza.pattern.templatemethod;

public class Client {
	
	public static void main(String[] args) {
		Operacao soma = new Soma();
		soma.efetuarOperacao(10, 4);
		
		Operacao sub = new Subtracao();
		sub.efetuarOperacao(10, 4);
	}

}
