package br.edu.ifpr.paranavai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploArquivo {

	public static void main(String[] args) {
		File arquivo = new File("numeros.txt");
		List<Integer> numeros = new ArrayList<Integer>();
		
		try {
			
			Scanner scanner = new Scanner(arquivo);
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
		try {
			int numero = Integer.parseInt(numeroStr);
			numeros.add(numero);
		} catch (NumberFormatException ex) {
			System.out.println("Não foi possível converter o conteúdo da linha em número inteiro.");
			System.out.println("Conteúdo da linha: " + numeroStr);
		}
	}

}
