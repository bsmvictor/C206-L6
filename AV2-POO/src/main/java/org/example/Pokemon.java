package org.example;

public abstract class  Pokemon {
    static int qtdPokemon = 0;
    private String nome;
    private String tipo;
    HeldItem helditem = null;

    public Pokemon(String nome, String tipo, HeldItem helditem) {
        qtdPokemon++;
        this.nome = nome;
        this.tipo = tipo;
        this.helditem = helditem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void atacar();

    public void mostraInfo(){
        System.out.println("\n-----INFORMACOES POKEMON-----");
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Held Item: " + helditem);
        System.out.println("Quantidade de pokemons: " + qtdPokemon);
        System.out.println("-----------------------------");
    }
}
