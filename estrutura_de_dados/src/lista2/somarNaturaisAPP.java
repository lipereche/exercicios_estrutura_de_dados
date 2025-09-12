package lista2;

public class somarNaturaisAPP {

	public static void main(String[] args) {
		
		somarNaturais somar = new somarNaturais();
		int N = 10;
        int soma = somarNaturais.somar(N);

        System.out.println("A soma dos primeiros " + N + " números naturais é: " + soma);
	}

}
