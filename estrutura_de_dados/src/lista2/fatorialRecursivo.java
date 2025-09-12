package lista2;

public class fatorialRecursivo {

	public static int calcular(int n) {
		if(n==1) {
			
			return n;
		}
			return n * calcular(n - 1);		
	}
}
