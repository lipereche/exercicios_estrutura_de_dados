package lista2;

import java.util.Scanner;

public class somarDigitosAPP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int resultado = SomarNumeros.somarDigitos(numero);      
        String expressao = SomarNumeros.expressaoDigito(numero);

        System.out.println(numero + " = " + expressao);
        System.out.println("Soma = " + resultado);

    }
}
