package lista4_java;

public class Exercicio04 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;

        double taxaA = 0.03;   // 3%
        double taxaB = 0.015;  // 1.5%

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA = populacaoA + (populacaoA * taxaA);
            populacaoB = populacaoB + (populacaoB * taxaB);
            anos++;
        }

        System.out.println("Quantidade de anos: " + anos);
        System.out.println("População final de A: " + (int) populacaoA);
        System.out.println("População final de B: " + (int) populacaoB);
    }
}


