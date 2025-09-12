package lista1;

public class questao1 implements iQuestao1 {
	private int anoPublicacao;
	private String editora;
	private String titulo;
	
	public questao1(int anoPublicacao, String editora, String titulo) {
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.titulo = titulo;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public void criarLivro(String titulo, String editora, int ano) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getAno() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void exibirLivro() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionarTitulo(String titulo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionarEditora(String editora) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionarAno(int ano) {
		// TODO Auto-generated method stub
		
	}
	
}
