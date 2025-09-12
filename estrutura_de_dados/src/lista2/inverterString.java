package lista2;

public class inverterString {
	public static String inverter(String palavra) {
		if(palavra.length() <= 1) {
			return palavra;
		}
		return inverter(palavra.substring(1)) + palavra.charAt(0);
	}
}
