package Pratica.pratica01;

public class Pratica001Livro {
    private String nome;
    public String autor;
    public int paginas;
    public int capitulos;


    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void status (){
        System.out.println("Sobre o livro: ");
        System.out.println("Nome do  Livro: " + getNome());
        System.out.println("Nome do Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
        System.out.println("Número de capitulos: " + capitulos );
    }
}
