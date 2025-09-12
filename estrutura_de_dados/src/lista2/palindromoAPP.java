package lista2;

public class palindromoAPP {

	public static void main(String[] args) {
	palindromo verificador = new palindromo();
		String frase = "A sacada da casa";

        frase = frase.toLowerCase();

        if (verificador.ehPalindromo(frase, 0, frase.length() - 1)) {
            System.out.println("\"" + frase + "\" é um palíndromo!");
        } else {
            System.out.println("\"" + frase + "\" não é um palíndromo!");
        }
    }

}	


