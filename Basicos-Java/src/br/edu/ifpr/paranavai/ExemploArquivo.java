package br.edu.ifpr.paranavai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploArquivo {

	public static void main(String[] args) {
		//A classe File pertence a biblioteca padrao do Java e serve como referencia para manipularmos arquivos
		File arquivo = new File("numeros.txt");
		
		//List eh uma interface do Java para estruturas de dados do tipo lista.
		//Existem varias implementacoes de List, sendo ArrayList uma das mais utilizadas.
		//Toda lista deve informar o tipo de valor que pode armazenar. Neste caso, armazenamos valores do tipo Integer.
		List<Integer> numeros = new ArrayList<Integer>();
		
		//A classe Scanner é responsavel por fazer a leitura do conteudo de um arquivo
		//Os comandos try e catch sao responsaveis por tratar possiveis erros que podem acontecer ao realizar a leitura do arquivo.
		try {
			
			Scanner scanner = new Scanner(arquivo);
			//O metodo hasNextLine verifica se o arquivo possui uma proxima linha para ser lida
			//Cada vez que o metodo nextLine eh chamado, um ponteiro avança para a proxima linha disponivel
			//Isso eh feito ate que se chegue no final do arquivo, o que vai fazer com que o while termine.
			while (scanner.hasNextLine()) {
				String numeroStr = scanner.nextLine();
				adicionaNumeroALista(numeros, numeroStr);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Quantidade de numeros: " + numeros.size());
		
		for (Integer n : numeros) {
			System.out.println(n);
		}
	}

	private static void adicionaNumeroALista(List<Integer> numeros, String numeroStr) {
		//Aqui tentamos converter uma String para int
		//Se a conversao ocorrer com sucesso, adicionamos o numero inteiro a lista numeros.
		//Caso a conversao falhe, nos mostramos uma mensagem de erro no console.
		try {
			int numero = Integer.parseInt(numeroStr);
			numeros.add(numero);
		} catch (NumberFormatException ex) {
			System.out.println("Não foi possível converter o conteúdo da linha em número inteiro.");
			System.out.println("Conteúdo da linha: " + numeroStr);
		}
	}

}
