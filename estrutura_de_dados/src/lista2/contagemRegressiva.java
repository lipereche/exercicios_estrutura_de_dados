package lista2;

public class contagemRegressiva {
	
	 public static void contagem(int n) {
	        if (n < 0) { 
	            return;
	        }
	        System.out.print(n + " "); 
	        contagem(n - 1); 
	    }
	
}
