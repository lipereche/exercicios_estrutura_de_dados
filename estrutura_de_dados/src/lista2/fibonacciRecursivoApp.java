package lista2;

public class fibonacciRecursivoApp {

	public static void main(String[] args) {
		int n = 10;
        System.out.println("Sequência de Fibonacci até " + n + " termos:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo.calcular(i) + " ");
        }
    }
}

