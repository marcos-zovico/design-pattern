package com.msouza.pattern.singleton;

public class Conexao {

	private static Conexao instanciaSingleton = null;

	private Conexao() {

	}

	public static Conexao getInstancia() {
		if (instanciaSingleton == null) {
			instanciaSingleton = new Conexao();
		}
		return instanciaSingleton;
	}

}
