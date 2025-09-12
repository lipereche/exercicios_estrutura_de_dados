package lista2;

public class contarCarectereAPP {

	public static void main(String[] args) {
		contarCaracteres contarChar = new contarCaracteres();
		String frase = "arara";
        char caractere = 'a';

        int vezes = contarCaracteres.contarChar(frase, caractere);

        System.out.println("O caractere '" + caractere + "' aparece " + vezes + " vezes.");
	}

}
