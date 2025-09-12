package lista2;

public class fatorialRecursivoAPP {

	public static void main(String[] args) {
	  
	       fatorialRecursivo fatorial = new fatorialRecursivo();
	        int numero = 5;

	        int resultado = fatorial.calcular(numero);

	        System.out.println("Fatorial de " + numero + " é: " + resultado);
	    }
	}
