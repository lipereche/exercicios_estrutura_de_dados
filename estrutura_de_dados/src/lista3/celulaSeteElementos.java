package lista3;

public class celulaSeteElementos {
private seteElementos valor;
private celulaSeteElementos proximo;

public celulaSeteElementos(seteElementos valor, celulaSeteElementos proximo) {
	
	this.valor = valor;
	this.proximo = proximo;
}

public seteElementos getValor() {
	return valor;
}

public void setValor(seteElementos valor) {
	this.valor = valor;
}

public celulaSeteElementos getProximo() {
	return proximo;
}

public void setProximo(celulaSeteElementos proximo) {
	this.proximo = proximo;
}


}
