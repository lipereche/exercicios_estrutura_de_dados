package lista3;

public class listaEncadeadaSeteElementos {
	 private static final int MAX = 7; 
	    private int[] lista = new int[MAX];
	    private int tamanho = 0;

	  
	    public void inserirFim(int valor) {
	        if (tamanho == MAX) {
	            System.out.println("A lista está cheia!");
	            return;
	        }
	        lista[tamanho] = valor;
	        tamanho++;
	    }

	    	    public void inserirInicio(int valor) {
	        if (tamanho == MAX) {
	            System.out.println("A lista está cheia!");
	            return;
	        }
	      
	        for (int i = tamanho; i > 0; i--) {
	            lista[i] = lista[i - 1];
	        }
	        lista[0] = valor;
	        tamanho++;
	    }

	    
	    public void mostrar() {
	        if (tamanho == 0) {
	            System.out.println("A lista está vazia!");
	        } else {
	            System.out.print("Lista: ");
	            for (int i = 0; i < tamanho; i++) {
	                System.out.print(lista[i] + " ");
	            }
	            System.out.println();
	        }
	    }

}
