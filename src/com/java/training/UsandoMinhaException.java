package com.java.training;

public class UsandoMinhaException {
	
	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 5, 32, 21, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};
		
		for (int i = 0; i < numeros.length; i++) {			
			try {
				if (numeros[i] % 2 != 0) {
					// lancar a exception aqui
					throw new DivisaoNaoExataException(numeros[i], denom[i]);
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExataException e) {
				System.out.println("Aconteceu um erro!");
				System.out.println("nome da classe: " + e.getClass().getName());
				System.out.println("messagem: " + e.getMessage());
				e.printStackTrace();
			} 
		}
		
	}

}
