package lista2;

public class binarioRecursivo {
	static public String calcular(int numero) {
		if(numero == 0) {
			return "";
		}
		return calcular(numero / 2) +(numero % 2);
	}
}
