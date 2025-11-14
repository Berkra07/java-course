package JavachallengesIfElse;

import java.util.Scanner;

public class AutoEscola {
    public static void main(String[] args) {

        Scanner ScQuestions = new Scanner(System.in);

       int pontos = 0;
       boolean desclassificado = false;

           System.out.println("Simulado prova do detran \uD83D\uDEA6 (responder apenas com sim/não ");

           System.out.println("Você queimou faixa: ");
           String resposta1 = ScQuestions.nextLine();

           if (resposta1.equalsIgnoreCase("sim")) {
               pontos += 3;
           }

           System.out.println("Você abaixou a viseira do capacete: ");
           String reposta2 = ScQuestions.nextLine();

           if (resposta1.equalsIgnoreCase("nao")) {
               pontos += 1;
           }

           System.out.println("Você interrompeu o motor da moto enquanto fazia a prova: ");
           String reposta3 = ScQuestions.nextLine();

           if (reposta3.equalsIgnoreCase("sim")){
               desclassificado = true;
           }

           if (pontos >=4){
               desclassificado = true;
           }

//           Resultado Final

        System.out.println("\n=== Resultado da prova ===");

        if (desclassificado && pontos == 0) {
            // Caso a única falha seja afogar a moto
            System.out.println("Você reprovou porque afogou a moto.");}

           if (desclassificado){
               System.out.println("Infelismente não foi dessa vez, boa sorte na proxima");
               System.out.println("Você foi DESCLASSIFICADO!");
           }
           else {
               System.out.println("Meus parabéns!!");
               System.out.println("Você passou, somou " + pontos + " ponto(s) e ficou dentro da média");
           }




    }
}


