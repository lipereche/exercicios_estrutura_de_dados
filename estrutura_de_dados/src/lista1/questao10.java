package lista1;

public class questao10 implements iQuestao10{
private String titulo;
private double duracao;
private String artista;
public questao10(String titulo, double duracao, String artista) {
	
	this.titulo = titulo;
	this.duracao = duracao;
	this.artista = artista;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public double getDuracao() {
	return duracao;
}
public void setDuracao(double duracao) {
	this.duracao = duracao;
}
public String getArtista() {
	return artista;
}
public void setArtista(String artista) {
	this.artista = artista;
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
public void listarMusicas() {
	// TODO Auto-generated method stub
	
}


}
