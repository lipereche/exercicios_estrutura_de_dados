package lista2;

public class potenciaSemMultiplicarAPP {

	public static void main(String[] args) {
		potenciaSemMultiplicar potencia = new potenciaSemMultiplicar();
		int base = 5;
        int expoente = 2;

        int resultado = potenciaSemMultiplicar.potencia(base, expoente);

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
	}

}
