package lista4_java;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o seu nome: ");
            String nome = sc.next();
            if (nome.length() < 3) {
                System.out.println("nome digitado menor que tres caracteres!!");
                System.out.println("Digite novamente");
                continue;
            }
            System.out.print("Informe a sua idade: ");
            int idade = sc.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade invalidade.");
                System.out.println("Digite a sua idade novamente");
                continue;
            }
            System.out.print("Informe o seu salario: ");
            double salario = sc.nextDouble();
            if (salario <= 0) {
                System.out.println("Salario invalido!!");
                System.out.println("Digite novamente");
                continue;
            }
            System.out.print("Informe seu sexo: ");
            char sexo = sc.next().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Sexo invalido!!");
                System.out.println("Digite novamente");
                continue;
            }
            System.out.print("Informe o seu estado civil: ");
            char estado_civil = sc.next().charAt(0);
            if (estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd') {
                System.out.println("Estado civil!!");
                System.out.println("Digite novamente");
                continue;
            }
            System.out.println("---------- RELATORIO PESSOAL -----------");
            System.out.println("NOME: "+nome);
            System.out.println("IDADE "+idade);
            System.out.println("SEXO "+sexo);
            System.out.println("ESTADO CIVIL "+estado_civil);
            break;

        }
        sc.close();
    }
}
