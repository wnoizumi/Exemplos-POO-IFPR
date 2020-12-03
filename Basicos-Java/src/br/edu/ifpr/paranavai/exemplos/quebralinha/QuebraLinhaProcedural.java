package br.edu.ifpr.paranavai.exemplos.quebralinha;

import java.util.Scanner;

public class QuebraLinhaProcedural {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a frase:");
		String frase = scanner.nextLine();
		
		System.out.println("Digite a quantidade de colunas:"); 
		int qtdColunas = scanner.nextInt();
		
		String[] palavras = frase.split("\\s+");
		
		String resultado = gerarResultado(qtdColunas, palavras);
		
		System.out.println(resultado);
	}

	private static String gerarResultado(int qtdColunas, String[] palavras) {
		int qtdColAtual = 0;
		String resultado = "";
		for (int i = 0; i < palavras.length; i++) {
			int tamanhoApos = qtdColAtual + palavras[i].length() + 1;
			if (tamanhoApos > qtdColunas) {
				resultado += System.lineSeparator();
				qtdColAtual = 0;
			} else if (qtdColAtual > 0) {
				resultado += " ";
				qtdColAtual += 1;
			}
			resultado += palavras[i];
			qtdColAtual += palavras[i].length();
		}
		return resultado;
	}

}
