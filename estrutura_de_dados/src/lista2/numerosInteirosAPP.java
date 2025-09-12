package lista2;

import java.util.Scanner;

public class numerosInteirosAPP {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número positivo: ");
	        int numero = sc.nextInt();

	        if (numero > 0) {
	            numerosInteiros obj = new numerosInteiros();
	            obj.mostrarInteiros(numero);
	        } else {
	            System.out.println("Digite um número inteiro positivo!");
	        }
	}
}