package lista1;

public class questao6 implements iQuestao6 {
private String nome;
private int cpf;
public questao6(String nome, int cpf) {
	super();
	this.nome = nome;
	this.cpf = cpf;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCpf() {
	return cpf;
}
public void setCpf(int cpf) {
	this.cpf = cpf;
}
@Override
public void adicionar() {
	// TODO Auto-generated method stub
	
}
@Override
public void remover() {
	// TODO Auto-generated method stub
	
}
@Override
public void atualizar() {
	// TODO Auto-generated method stub
	
}
@Override
public void excluir() {
	// TODO Auto-generated method stub
	
}


}
