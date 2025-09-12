package lista2;

public class binarioRecursivoAPP {

	public static void main(String[] args) {
		binarioRecursivo binario = new binarioRecursivo();
		int numero = 123;
		
		 String resultado = binario.calcular(numero);

	        if (resultado.equals("")) {
	            resultado = "0";
	        }

	        System.out.println("O número " + numero + " em binário é: " + resultado);
	    }
	}