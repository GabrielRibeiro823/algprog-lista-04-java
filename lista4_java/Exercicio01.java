package lista4_java;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("digite um numero entre 0 e 10: ");
            int num2 = sc.nextInt();

            if (num2 > 10 || num2 < 0){
                System.out.println("O numero "+num2+" é invalido");
                break;
            }
        }
        sc.close();
    }
}
