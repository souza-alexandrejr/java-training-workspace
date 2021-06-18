package com.java.training;

@SuppressWarnings("serial")
public class DivisaoNaoExataException extends Exception {

	private int num;
	private int den;
	
	public DivisaoNaoExataException(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + den + " nao eh um inteiro!";
	}
	
}
