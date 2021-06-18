package com.java.training;

public class UsandoMinhaException2 {
	
	public static void main(String[] args) throws Exception {
		
		int[] numeros = {4, 8, 16, 5, 32, 21, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};
		
		for (int i = 0; i < numeros.length; i++) {			
			try {
				if (numeros[i] % 2 != 0) {
					// lancar a exception aqui
					throw new Exception("Numero impar, divisao nao exata!");
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro!");
			} catch (Exception e) {
				System.out.println("Aconteceu um erro!");
				System.out.println(e.getMessage());
			}
		}
		
	}

}
