package lista1;

public class questao14 {
private String nome;
private String cargo;
private String dataAdmissao;
private double salario;
public questao14(String nome, String cargo, String dataAdmissao, double salario) {
	
	this.nome = nome;
	this.cargo = cargo;
	this.dataAdmissao = dataAdmissao;
	this.salario = salario;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public String getDataAdmissao() {
	return dataAdmissao;
}
public void setDataAdmissao(String dataAdmissao) {
	this.dataAdmissao = dataAdmissao;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}

}
