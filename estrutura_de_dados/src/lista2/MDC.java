package lista2;

public class MDC {

	public static int mdc(int a, int b) {
		
		if (b==0) {
			return a;
	
		}
		return mdc(b,a % b);
}
}