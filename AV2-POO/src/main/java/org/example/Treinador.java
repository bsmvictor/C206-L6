package org.example;

public class Treinador {
    private String nome;
    Pokemon[] pokemons = new Pokemon[10];


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addPokemon(Pokemon p) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                pokemons[i] = p;
                System.out.println("Pokemon adicionado!\n");
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("\n-----INFORMACOES TREINADOR-----");
        System.out.println("\nNome: " + getNome());
        for (int i = 0; i < pokemons.length; i++){
            pokemons[i].mostraInfo();
            break;
        }
    }
}
