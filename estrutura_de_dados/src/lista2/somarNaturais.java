package lista2;

public class somarNaturais {

	public static int somar(int n) {
		if(n == 0) {
			return 0;
		}
		return n + somar(n - 1);
	}
}


