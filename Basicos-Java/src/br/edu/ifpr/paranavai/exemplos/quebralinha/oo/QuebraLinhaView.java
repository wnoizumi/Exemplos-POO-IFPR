package br.edu.ifpr.paranavai.exemplos.quebralinha.oo;

import java.io.PrintStream;
import java.util.Scanner;

public class QuebraLinhaView {
	
	public Scanner entrada;
	private PrintStream saida;
	private String frase;
	private int numeroColunas;
	
	public QuebraLinhaView() {
		entrada = new Scanner(System.in);
		saida = System.out;
	}

	public void solicitarDados() { 
		boolean fraseInvalida = false;
		boolean numColInvalida = false;
		do {
			if (fraseInvalida || numColInvalida)
				saida.println("Entrada inválida. Digite novamente.");
			
			saida.println("Digite a frase:");
			frase = entrada.nextLine();
			
			fraseInvalida = frase.trim().length() == 0;
			
			saida.println("Digite a quantidade de colunas:"); 
			String numeroColunasStr = entrada.nextLine();
			
			try {
				numeroColunas = Integer.parseInt(numeroColunasStr);
				if (numeroColunas <= 0) {
					numColInvalida = true;
				}
			} catch (NumberFormatException ex) {
				numColInvalida = true;
			}
		} while (fraseInvalida || numColInvalida);
	}

	public String getFrase() {
		return this.frase;
	}

	public int getNumeroColunas() {
		return this.numeroColunas;
	}

	public void exibirTexto(String texto) {
		saida.println(texto);
	}

	public boolean executarNovamente() {
		saida.println("Deseja executar novamente? [S/N]");
		String resposta = entrada.nextLine();
		return resposta.equalsIgnoreCase("s");
	}
}
