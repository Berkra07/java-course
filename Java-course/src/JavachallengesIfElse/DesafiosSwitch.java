package JavachallengesIfElse;

import java.util.Scanner;

public class DesafiosSwitch {
    public static void main(String[] args) {


//        DESAFIO 01: Dia da semana --------------------------------------------------------------

        Scanner scWeekVerific = new Scanner(System.in);

        System.out.println("Digite um numero que direi que dia da semana é hoje: ");

        int weekVerific = scWeekVerific.nextInt();

        switch (weekVerific){

            case 1:
                System.out.println("Hojé é Segunda-feira");
                break;
            case 2:
                System.out.println("Hoje é terça-feira");
            break;
            case 3:
                System.out.println("Hoje é quarta-feira");
                break;
            case 4:
                System.out.println("hoje é quinta-feira");
                break;
            case 5:
                System.out.println("Hoje é Sexta-feira");
                break;
            case 6:
                System.out.println("Hoje é Sabado");
                break;
            case 7:
                System.out.println("Hoje é Domingo");
        }
    }
}

class Desafiodois {
    public static void main(String[] args) {
        Scanner scNotaLanche = new Scanner(System.in);

        System.out.println("De uma Nota de 0 a 6 para o lanche: ");

        int notaLanche = scNotaLanche.nextInt();

        switch (notaLanche) {

            case 1:
                System.out.println("Reprovado");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Ótimo");
                break;
            case 6:
                System.out.println("Exelente");

        }
    }
}
class desafioTres{
    public static void main(String[] args) {
        System.out.println("Escolha entre as opções: ");
        System.out.println("1 - Pizza");
        System.out.println("2 - Lanche");
        System.out.println("3 - Salada");
        System.out.println("4 - sair");

        Scanner scCardapio = new Scanner(System.in);

        int cardapio = scCardapio.nextInt();

        switch (cardapio){
            case 1:
                System.out.println("Você pediu uma pizza!");
                break;
            case 2:
                System.out.println("Você pediu um Lanche!");
                break;
            case 3:
                System.out.println("Você pediu uma salada!");
                break;
            case 4:
                System.out.println("Obrigado por nos visitar, volte sempre!");
        }
    }
}
class desafioQuatro {
    public static void main(String[] args) {

        System.out.println("1- Dólar ");
        System.out.println("2- Euro");
        System.out.println("3- Real");
        System.out.println("Escolha para qual moeda deseja converter:");

        Scanner scConversao = new Scanner(System.in);
        int conversao = scConversao.nextInt();

        switch (conversao) {
            case 1:
                System.out.println("Você escolheu Dólar.");
                break;
            case 2:
                System.out.println("Vôce escolheu Euro.");
                break;
            case 3:
                System.out.println("Você escolheu Real Brasileiro.");
        }
    }
}
class desafioCinco{
    public static void main(String[] args) {
        System.out.println("Digite uma cor em inglês: ");

        Scanner scColor = new Scanner(System.in);
        String Color = scColor.next();

        Color = Color.toLowerCase();

        switch (Color){
            case "red":
                System.out.println(Color + " quer dizer : Vermelho");
                break;
            case "blue":
                System.out.println(Color + " quer dizer: Azul.");
                break;
            case "green":
                System.out.println(Color + " quer dizer: Verde.");
        }
    }
}