package br.edu.ifpr.paranavai.exemplos.quebralinha.oo;

public class QuebraLinhas {

	private final String frase;
	private final int numeroColunas;
	private String fraseQuebrada;

	public QuebraLinhas(String frase, int numeroColunas) {
		this.frase = frase;
		this.numeroColunas = numeroColunas;
		this.fraseQuebrada = null;
	}

	private void quebrar() {
		String[] palavras = frase.split("\\s+");
		
		int qtdColAtual = 0;
		String resultado = "";
		for (int i = 0; i < palavras.length; i++) {
			int tamanhoApos = qtdColAtual + palavras[i].length() + 1;
			if (tamanhoApos > numeroColunas) {
				resultado += System.lineSeparator();
				qtdColAtual = 0;
			} else if (qtdColAtual > 0) {
				resultado += " ";
				qtdColAtual += 1;
			}
			resultado += palavras[i];
			qtdColAtual += palavras[i].length();
		}
		this.fraseQuebrada = resultado;
	}

	public String getFraseQuebrada() {
		if (fraseQuebrada == null)
			quebrar();
		return this.fraseQuebrada;
	}
}
