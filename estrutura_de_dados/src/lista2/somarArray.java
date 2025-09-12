package lista2;

public class somarArray {
	
	public static int somar(int[] numero, int indice) {
		if(indice == numero.length - 1) {
			return numero[indice];
		}
		return numero[indice] + somar(numero, indice + 1);
	} 
}
