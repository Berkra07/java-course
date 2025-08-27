import java.util.Scanner;

public class EstruturaCondicionalIfElse {
    public static void main(String[] args) {

        /* Estrutura condicional (If-Else)
        *
        * if(condição) {
        * }(Se condição for verdadeira -> execute ...)
        * else{
        * } (senão execute)
         * If-> se-> Se condição for verdadeira execute ...
         * Elsee-> senão-> se a condição for falsa execute...  */

//       ex 1 ----------------------------------------------------------------------------------------------------

        /*int idade =18;

        if (idade >=18){
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade");
        }*/

//       ex 2 ----------------------------------------------------------------------------------------------------

        /*boolean chovendo = false;
        if(!chovendo){
            System.out.println("Vamos correr");
        }
        else {
            System.out.println("Vamos lêr");
        }*/

//      ex 3 ----------------------------------------------------------------------------------------------------

        /*boolean hmoney = false;
        boolean hlimit = false;

        if (hmoney && hlimit){
            System.out.println("compre comida e sorvete.");
        }
        else if (hmoney || hlimit){
            System.out.println("Pede só comida.");
        }
        else {
            System.out.println("faz algo caseiro.");
        }*/

//        Ex 4 ----------------------------------------------------------------------------------------------------
/*
        int numero = -1;

        if (numero >= 0){
            System.out.println("numero positivo");
        }
        else {
            System.out.println("numero negativo");*/
//      Ex 5 w

           /* Scanner sc = new Scanner(System.in);

            // Lê o número digitado pelo usuário
            System.out.print("Digite um número inteiro: ");
            long numero1 = sc.nextLong();

            // Verifica se é par ou ímpar
            //% é o operador de resto da divisão.
            if (numero1 % 2 == 0) {
                System.out.println("O número " + numero1 + " é PAR.");
            } else {
                System.out.println("O número " + numero1 + " é ÍMPAR.");
            }*/

//      Ex 6

        Scanner nota = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int notaSchool = nota.nextInt();



    }
}
