package recursividade;

public class multiplosAPP {

   
    public static void imprimirMultiplos(int atual  , int limite) {
             if (atual > limite) {
            return;
        }

       
        int multiplo = atual * 2;
        System.out.println(multiplo);

      
        imprimirMultiplos(atual +1, limite);
    }
}
