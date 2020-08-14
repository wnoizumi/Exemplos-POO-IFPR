package br.edu.ifpr.paranavai;

public class Exemplo {
	
	public static void main(String[] args) {
		
		int soma = somaDivisiveisTresECinco(1000);
		
		
		System.out.println(soma);
	}
	
	public static int somaDivisiveisTresECinco(int limite) {
		int soma = 0;
		for (int i = 0; i <= limite; i++) {
			
			if (i % 3 == 0 || i % 5 == 0) {
				soma = soma + i;
			}
		}
		
		return soma;
	}

}
