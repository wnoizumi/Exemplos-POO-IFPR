package br.edu.ifpr.paranavai.exemplos.quebralinha.oo;

public class QuebraLinhaController {
	
	private QuebraLinhaView view;

	public QuebraLinhaController(QuebraLinhaView view) {
		this.view = view;
	}
	
	public void inicializar() {
		view.exibirTexto("Software de Quebra de Linhas");
		do {
			executarQuebraLinha();
		} while (view.executarNovamente()); 
	}
	
	private void executarQuebraLinha() {
		view.solicitarDados();
		
		String frase = view.getFrase();
		int numeroColunas = view.getNumeroColunas();
		
		QuebraLinhas quebraLinhas = new QuebraLinhas(frase, numeroColunas);
		String fraseQuebrada = quebraLinhas.getFraseQuebrada();
		
		view.exibirTexto("Operação realizada com sucesso!");
		view.exibirTexto("Resultado:");
		view.exibirTexto(fraseQuebrada);
	}

}
