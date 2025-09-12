package lista2;

public class descobrirMaiorElementoAPP {

	public static void main(String[] args) {
		descobrirMaiorElemento maiorElemento = new descobrirMaiorElemento();
		int[] valores = {3, 7, 2, 9, 5};

        int maior = descobrirMaiorElemento.maiorElemento(valores, 0);

        System.out.println("O maior elemento é: " + maior);

	}

}
