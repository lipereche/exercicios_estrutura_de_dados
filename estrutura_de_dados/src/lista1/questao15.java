package lista1;

public class questao15 {
private double horaChegada;
private String nomePaciente;
private String prioridade;
public questao15(double horaChegada, String nomePaciente, String prioridade) {
	
	this.horaChegada = horaChegada;
	this.nomePaciente = nomePaciente;
	this.prioridade = prioridade;
}
public double getHoraChegada() {
	return horaChegada;
}
public void setHoraChegada(double horaChegada) {
	this.horaChegada = horaChegada;
}
public String getNomePaciente() {
	return nomePaciente;
}
public void setNomePaciente(String nomePaciente) {
	this.nomePaciente = nomePaciente;
}
public String getPrioridade() {
	return prioridade;
}
public void setPrioridade(String prioridade) {
	this.prioridade = prioridade;
}

}
