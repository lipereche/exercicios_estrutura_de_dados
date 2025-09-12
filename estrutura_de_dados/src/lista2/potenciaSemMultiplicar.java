package lista2;

public class potenciaSemMultiplicar {

	 public static int multiplicar(int a, int b) {
	        if (b == 0) {
	            return 0; 
	        }
	        return a + multiplicar(a, b - 1); 
	    }

	   
	    public static int potencia(int base, int expoente) {
	        if (expoente == 0) {
	            return 1; 
	        }
	        return multiplicar(base, potencia(base, expoente - 1));
	    }

}
