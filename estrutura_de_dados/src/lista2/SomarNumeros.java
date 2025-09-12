
package lista2;

public class SomarNumeros {
	
	public static int somarDigitos(int numero) {
		
	if(numero < 10) {
		
		return numero;
	}
	return (numero % 10) + somarDigitos(numero / 10);
		
}
	  public static String expressaoDigito(int numero) {
	        if (numero < 10) {
	            return String.valueOf(numero); 
	        }
	        return expressaoDigito(numero / 10) + " + " + (numero % 10);
	    }
}
