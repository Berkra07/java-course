package Pratica;

public class Pratica001Livro {
    public String nome;
    public String autor;
    public int paginas;
    public int capitulos;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome=n;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String a){
        this.autor=a;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setPaginas(int p){
        this.paginas=p;
    }

    public int getCapitulos(){
        return this.capitulos;
    }

    public void setCapitulos(int c){
        this.capitulos=c;
    }

    public void status (){
        System.out.println("Sobre o livro: ");
        System.out.println("Nome do  Livro: " + this.getNome());
        System.out.println("Nome do Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
        System.out.println("Número de capitulos: " + capitulos );
    }
}
