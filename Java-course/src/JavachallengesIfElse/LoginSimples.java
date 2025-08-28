package JavachallengesIfElse;

import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {

        Scanner scLogin = new Scanner(System.in);
        Scanner scSenha = new Scanner(System.in);

        System.out.println("Digite seu Login: ");
        String login = scLogin.nextLine();

        System.out.println("Digite sua senha: ");
        int senha = scSenha.nextInt();



        if (login.equals("admin") && senha == 123 ){
            System.out.println("bem vindo Bernardo!");
        }
        else {
            System.out.println("Login invalido");
        }
    }
}
