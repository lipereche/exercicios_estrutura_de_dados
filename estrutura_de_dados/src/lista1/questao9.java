package lista1;

public class questao9 {
private String nomeCliente;
private String itensPedido;
private int quantidade;
private double valor;
public questao9(String nomeCliente, String itensPedido, int quantidade, double valor) {
	
	this.nomeCliente = nomeCliente;
	this.itensPedido = itensPedido;
	this.quantidade = quantidade;
	this.valor = valor;
}
public String getNomeCliente() {
	return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}
public String getItensPedido() {
	return itensPedido;
}
public void setItensPedido(String itensPedido) {
	this.itensPedido = itensPedido;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}

}
