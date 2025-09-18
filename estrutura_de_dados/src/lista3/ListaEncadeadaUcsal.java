package lista3;

public class ListaEncadeadaUcsal {
	private celulaUcsal primeiro;
	private celulaUcsal ultimo;
	private celulaUcsal posicaoAtual;
	
	public void adicionar(professorUcsal valor) {
		celulaUcsal celulaUcsal = new celulaUcsal();
		celulaUcsal.setValor(valor);
		
		if(primeiro == null && ultimo == null ) {
			primeiro = celulaUcsal;
			ultimo = celulaUcsal;
		}else {
			ultimo.setProximo(celulaUcsal);
			ultimo = celulaUcsal;
		}
	}
	public boolean temProximo() {

		if(primeiro == null) {
			return false;
		}else if(posicaoAtual == null){
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}
	public celulaUcsal getPosicaoAtual() {
		return posicaoAtual;
	}
	public void removerTodos() {
		primeiro = null;
		ultimo = null;
		posicaoAtual = null;
	}
	public void registroLista() {
		if(primeiro == null) {
		System.out.println("Lista esta vazia!");
		return;
	}	

	celulaUcsal atual = primeiro;
	while(atual != null) {
		System.out.println(atual.getValor());
		atual = atual.getProximo();
		}
}
	public int tamanho() {
		int contador = 0;
		celulaUcsal atual = primeiro;
		
		while(atual != null) {
			contador++;
			atual = atual.getProximo();
		}
		return contador;
	}
}
