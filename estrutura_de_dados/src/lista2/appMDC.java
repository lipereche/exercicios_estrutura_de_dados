package lista2;

public class appMDC {

	public static void main(String[] args) {
		 	int x = 30;
	        int y = 18;
	        
	        MDC calculadora = new MDC();

	        int resultado = calculadora.mdc(x, y);
	        System.out.println("MDC(" + x + ", " + y + ") = " + resultado);

	}

}
