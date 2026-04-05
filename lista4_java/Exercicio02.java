package lista4_java;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("digite o nome de usuario");
            String usuario = sc.next();

            System.out.println("Digite a sua senha");
            String senha = sc.next();

            if (!Objects.equals(usuario, senha)) {
                System.out.println("Acesso permitido");
                break;
            } else {
                System.out.println("senha invalida");
                System.out.println("digite novamente");
            }
        }
        sc.close();
    }
}
