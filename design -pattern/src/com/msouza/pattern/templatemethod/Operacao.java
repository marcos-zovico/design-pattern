package com.msouza.pattern.templatemethod;

abstract public class Operacao {
	
	abstract public int handlerEfetuarOperacao(int valor1, int valor2);
	
	public void efetuarOperacao(int valor1, int valor2){
		
		// codigos
		int resultado = handlerEfetuarOperacao(valor1, valor2);
		System.out.println("O Resultado é: " + resultado);
	}

}
