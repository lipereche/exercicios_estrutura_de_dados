package lista3;

public class listaEncadeadaAnalise {
celulaAnalise primeiro;
celulaAnalise ultimo;
celulaAnalise posicaoAtual;

public void adicionar(alunoAnalise valor) {
	celulaAnalise celula = new celulaAnalise();
	celula.setValor(valor);
	if(primeiro == null && ultimo == null) {
		primeiro = celula;
		ultimo = celula;
	}else {
		ultimo.setProximo(celula);
		ultimo = celula;
		
	}
}
public void remover(alunoAnalise valor) {
	if(primeiro.getProximo() != null ) {
		celulaAnalise celula = this.recuperarPenultimo(this.primeiro);
		ultimo = celula;
		celula.setProximo(null);
	}else {
		primeiro = ultimo = null;
	}	
}
private celulaAnalise recuperarPenultimo(celulaAnalise celula) {
	if(celula.getProximo().equals(ultimo)) {
		return celula;
	}
	return recuperarPenultimo(celula.getProximo());
}
public alunoAnalise pesquisarPorMatricula(int matricula) {
	celulaAnalise atual  = primeiro;
	
	while(atual != null) {
		alunoAnalise a = atual.getValor();
		if(a.getMatricula() == matricula) {
			return a;
		}
		atual = atual.getProximo();
	}
	return null;
}
public void ordemAlfabetica(alunoAnalise valor) {
	celulaAnalise nova = new celulaAnalise();
	nova.setValor(valor);
	if(primeiro == null) {
		primeiro = nova;
		ultimo=nova;
		return;
	}
	if(valor.getNome().compareToIgnoreCase(primeiro.getValor().getNome()) < 0 ) {
		nova.setProximo(primeiro);
		primeiro = nova;
		return;
	}
	celulaAnalise atual = primeiro;
	while(atual.getProximo() != null  && valor.getNome().compareToIgnoreCase(atual.getProximo().getValor().getNome() ) > 0  ) {
	atual = atual.getProximo();	
	}
	nova.setProximo(atual.getProximo());
	atual.setProximo(nova);
	
	if(nova.getProximo() == null) {
		ultimo =nova;
	}
}

}

