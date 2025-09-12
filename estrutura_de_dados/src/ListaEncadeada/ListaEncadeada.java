package ListaEncadeada;

public class ListaEncadeada {
	private celula primeiro;
	private celula ultimo;
	private celula posicaoAtual;
	
	public void adicionar(professor valor) {
		celula celula = new celula();
		celula.setValor(valor);
		
		if(primeiro == null && ultimo == null ) {
			primeiro = celula;
			ultimo = celula;
		}else {
			ultimo.setProximo(celula);
			ultimo = celula;
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
	public celula getPosicaoAtual() {
		return posicaoAtual;
	}
	public void remover() {
		if(primeiro.getProximo() != null) {
			celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
			
		}else{
			primeiro = ultimo = null;
		}
	}
	private celula recuperarPenultimo(celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			
		}
		return celula;
	}
}
