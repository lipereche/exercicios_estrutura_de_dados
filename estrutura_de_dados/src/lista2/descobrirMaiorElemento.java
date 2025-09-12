package lista2;

public class descobrirMaiorElemento {
	
	public static int maiorElemento(int[] numero, int indice) {
		if(indice == numero.length -1) {
			return numero[indice];
		}
		int maiorDoResto = maiorElemento(numero, indice + 1);
		if(numero[indice] > maiorDoResto) {
			return numero[indice];
		}else {
			return maiorDoResto;
		}
	}
}
