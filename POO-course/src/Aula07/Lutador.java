package Aula07;

public class Lutador{

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador (String no, String na, int id, float al, float pe, String ca, int vi, int de, int em){
        this.nome= no;
        this.nacionalidade= na;
        this.idade=id;
        this.altura=al;
        this.peso=pe;
        this.categoria=ca;
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=em;
    }
}
