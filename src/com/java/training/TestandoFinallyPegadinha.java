package com.java.training;

public class TestandoFinallyPegadinha {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) {
			
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero!");
				System.exit(0);
			} catch (Throwable e) {
				System.out.println("Ocorreu um erro!");
				System.exit(0);
			} finally {
				System.out.println("Essa linha e impressa sempre apos o try ou catch.");
			}
			
		}

	}
	
}
