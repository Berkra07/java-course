import java.util.Scanner;

public class EntradaESaidaDeDados {
    public static void main(String[] args) {

        /*Saidada de Dados
        * Usamos System.out.print(), System.out,println() e System.out,printf() para imprimir dados na tela:
        *
        * System.out.print(): Imprime sem pular linha. (mais utilizado
        * System.out,println(): Imprime e pula para prox. linha
        * System.out,printf(): imprime formatado( Explicar melhor)*/

        /*Entrada de dados
         *
         * usamos a classe Scanner para ler dados do teclado*/

        Scanner Scanner = new Scanner(System.in);

        System.out.println( "Olá, Digite seu nome: ");
        String nome = Scanner.nextLine();
        System.out.println( "Olá, " + nome + " Prazer em recebe-lo aqui!!");

        System.out.println( "Digite sua idade: ");
        int idade = Scanner.nextInt();
        System.out.println("Sua idade: " + idade);

        System.out.println("Quanto dinheiro quer guardar hoje: ");
        double dinheiro = Scanner.nextDouble();
        System.out.println("Você poupou: R$" + dinheiro + " esse mês.");

        System.out.println( nome + ", Você tem " + idade +" e poupou R$" + dinheiro +" esse mês");
    }
}
