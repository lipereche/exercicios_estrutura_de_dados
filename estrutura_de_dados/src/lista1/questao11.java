package lista1;

public class questao11 {
private String nome ;
private int codigo;
private double precoUnitario;
private int quantidadeEstoque;
public questao11(String nome, int codigo, double precoUnitario, int quantidadeEstoque) {
	
	this.nome = nome;
	this.codigo = codigo;
	this.precoUnitario = precoUnitario;
	this.quantidadeEstoque = quantidadeEstoque;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public double getPrecoUnitario() {
	return precoUnitario;
}
public void setPrecoUnitario(double precoUnitario) {
	this.precoUnitario = precoUnitario;
}
public int getQuantidadeEstoque() {
	return quantidadeEstoque;
}
public void setQuantidadeEstoque(int quantidadeEstoque) {
	this.quantidadeEstoque = quantidadeEstoque;
}

}
