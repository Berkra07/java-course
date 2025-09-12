public class AprendendoArrays {
    public static void main(String[] args) {

        String[] guns = {"Ak-47","M4-A4","AWM"};

        System.out.println(guns[0]); // Os elementos da Array sempre começa em 0


//      Outra forma de usar o Array:

        String [] cars = new String[5];

        cars [0] = "Polo";
        cars [1] = "Gol";
        cars [2] = "Virtus";
        cars [3] = "Ferrari";
        cars [4] = "Mustang";

        System.out.println("O seu " + cars[4] + " está na garagem N: 47");
       /*Dessa forma primeiro voce dá o numero maximo de variaveis que o Array vai aceitar e depois voce nomeia cada
       * um conforme o numero que o deduzirá*/
    }
}