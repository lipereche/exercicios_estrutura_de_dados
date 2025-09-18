package lista3;

public class celulaPercorrer {
private percorrerLista valor;
private celulaPercorrer proximo;

public celulaPercorrer(percorrerLista valor, celulaPercorrer proximo) {
	
	this.valor = valor;
	this.proximo = proximo;
}

public percorrerLista getValor() {
	return valor;
}

public void setValor(percorrerLista valor) {
	this.valor = valor;
}

public celulaPercorrer getProximo() {
	return proximo;
}

public void setProximo(celulaPercorrer proximo) {
	this.proximo = proximo;
}


}
