package Pratica;

public class Pratica001Livro {
    public String nome;
    public String autor;
    private int paginas;
    private int capitulos;


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
}
