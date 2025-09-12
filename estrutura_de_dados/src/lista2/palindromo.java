package lista2;

public class palindromo {
	
	public boolean ehPalindromo(String p, int inicio, int fim) {
		
		if( inicio >= fim) {
			return true;
		}
		if(p.charAt(inicio) == ' ') {
			return ehPalindromo(p, inicio + 1, fim);
		}
		if(p.charAt(fim) == ' ') {
			return ehPalindromo(p, inicio, fim - 1);
		}
		if(p.charAt(inicio) != p.charAt(fim)) {
			return false;
		}
		return ehPalindromo(p, inicio + 1, fim - 1);
	}
}
