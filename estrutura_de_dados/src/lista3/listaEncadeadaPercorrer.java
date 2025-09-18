package lista3;

public class listaEncadeadaPercorrer {
	private celulaPercorrer primeiro;
	private celulaPercorrer ultimo;
	private celulaPercorrer posicaoAtual;
	
	public int percorre(int elemento) {
		
		celulaPercorrer atual = primeiro;
		
		int posicao = 0;
		
		while(atual != null) {
			
			if(atual.getValor().getElemento() == elemento) {
				
				return posicao;
			}
			atual = atual.getProximo();
			posicao++;
		}
		return -1;
	}
	public int buscarRecursivo(int matricula) {
	    return buscarRecursivo(primeiro, matricula, 0);
	}

	private int buscarRecursivo(celulaPercorrer atual, int posicao, int elemento) {
	    if (atual == null) {
	        return -1; 
	    }
	    if (atual.getValor().getElemento() == elemento) {
	        return posicao; 
	    }     
	    return buscarRecursivo(atual.getProximo(), elemento, posicao + 1);
	}
}

