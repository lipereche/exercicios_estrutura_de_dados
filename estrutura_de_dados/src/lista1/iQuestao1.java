package lista1;

public interface iQuestao1 {

    void criarLivro(String titulo, String editora, int ano);

    String getTitulo();
    String getEditora();
    int getAno();

    void adicionarTitulo(String titulo);
    void adicionarEditora(String editora);
    void adicionarAno(int ano);

    
    void exibirLivro();
}
