package recursividade;

public class numerosNaturais {
	
    public static void imprimirNumeros(int numero) {
      
        if (numero > 100) {
            return;
        }

      
        System.out.println(numero);

    
        imprimirNumeros(numero + 1);
    }

}
