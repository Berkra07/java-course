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

           if (resposta1.equalsIgnoreCase("sim")) {
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

           if (desclassificado){
               System.out.println("Infelismente não foi dessa vez, voce somou: " + pontos + " para passar é necessário tirar menos de 4 pontos.");
           }
           else {
               System.out.println("Meus parabéns!!");
               System.out.println("Você passou, somou" + pontos +"e ficou dentro da média");
           }




    }
}


