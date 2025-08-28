package JavachallengesIfElse;

import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {

        Scanner scLogin = new Scanner(System.in);
        Scanner scSenha = new Scanner(System.in);

        System.out.println("Digite seu Login: ");
        System.out.println("Digite sua senha: ");

        String login = scLogin.nextLine();
        int senha = scSenha.nextInt();

        if (senha== 1234 && login.equals("admin") ){
            System.out.println("bem vindo Bernardo!");
        }
        else {
            System.out.println("Login invalido");
        }
    }
}
