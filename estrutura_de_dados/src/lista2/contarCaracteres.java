package lista2;

public class contarCaracteres {
	
	public static int contarChar(String texto,char c) {
		if(texto.length() == 0) {
			return 0;
		}
		int contador=0;
		if(texto.charAt(0) == c) {
			contador = 1;
		}
		return contador + contarChar(texto.substring(1), c);	
		
	}
}
