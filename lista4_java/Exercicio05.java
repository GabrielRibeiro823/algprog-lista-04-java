package lista4_java;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            double populacaoA;
            double populacaoB;
            double taxaA;
            double taxaB;

            while (true) {
                System.out.print("Informe a população do país A: ");
                populacaoA = sc.nextDouble();
                if (populacaoA > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número positivo.");
                }
            }

            while (true) {
                System.out.print("Informe a população do país B: ");
                populacaoB = sc.nextDouble();
                if (populacaoB > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número positivo.");
                }
            }

            while (true) {
                System.out.print("Informe a taxa de crescimento de A (%): ");
                taxaA = sc.nextDouble();
                if (taxaA > 0) {
                    taxaA = taxaA / 100;
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número positivo.");
                }
            }

            while (true) {
                System.out.print("Informe a taxa de crescimento de B (%): ");
                taxaB = sc.nextDouble();
                if (taxaB > 0) {
                    taxaB = taxaB / 100;
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número positivo.");
                }
            }

            int anos = 0;

            if (populacaoA >= populacaoB) {
                System.out.println("A população de A já é maior ou igual a B.");
            } else if (taxaA <= taxaB) {
                System.out.println("A população de A nunca ultrapassará B com essas taxas.");
            } else {
                while (populacaoA < populacaoB) {
                    populacaoA += populacaoA * taxaA;
                    populacaoB += populacaoB * taxaB;
                    anos++;
                }

                System.out.println("Quantidade de anos: " + anos);
                System.out.println("População final de A: " + (int) populacaoA);
                System.out.println("População final de B: " + (int) populacaoB);
            }

            System.out.print("Deseja repetir? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa encerrado.");
        sc.close();
    }
}

