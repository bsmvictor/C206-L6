package org.example;

public class Estudante {
    String nome;
    int idade;
    String ano;

    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    public void mostraInfo(){
        System.out.println("\n-----------------------");
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Ano letivo: " + this.ano);
    }
}
