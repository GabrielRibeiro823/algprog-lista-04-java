package lista4_java;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (i == 1) {
                maior = numero; // primeiro número vira referência
            } else if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

    }
}

