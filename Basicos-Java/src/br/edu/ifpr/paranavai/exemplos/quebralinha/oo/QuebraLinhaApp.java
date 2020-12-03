package br.edu.ifpr.paranavai.exemplos.quebralinha.oo;

public class QuebraLinhaApp {
	
	public static void main(String[] args) {
		QuebraLinhaView view = new QuebraLinhaView();
		QuebraLinhaController controller = new QuebraLinhaController(view);
		controller.inicializar();
	}
}
