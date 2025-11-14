package JavachallengesIfElse;

public class DinheiroComida {
    public static void main(String[] args) {

        boolean hmoney = false;
        boolean hlimit = false;

        if (hmoney && hlimit){
            System.out.println("compre comida e sorvete!.");
        }
        else if (hmoney || hlimit){
            System.out.println("Pede só comida.");
        }
        else {
            System.out.println("faz algo caseiro.");
        }
    }
}
