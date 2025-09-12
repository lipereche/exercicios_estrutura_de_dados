package lista2;

public class numerosInteiros {
	
	
	public void mostrarInteiros(int numero) {
		        if (numero == 0) {
		            return; 
		        }
		        mostrarInteiros(numero - 1);
		        System.out.print(numero + " "); 
		    }
}
