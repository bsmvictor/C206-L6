package org.example;

public class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    public void mostraInfo(){
        System.out.println("\n-------------------");
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ranking: " + this.ranking);
    }

}
