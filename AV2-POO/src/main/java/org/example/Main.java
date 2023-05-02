package org.example;

public class Main {
    public static void main(String[] args) {

        HeldItem h1 = new HeldItem();
        h1.tipo = "folha";

        //INSTANCIANDO POKEMONS
        Pokemon po = new Bulbassaur("Ferdinando", "terra", h1, 700);
        Pokemon po2 = new Pikachu("Pherb", "raio", null, 560);
        Pokemon po3 = new Squirtle("Pitolomeu", "agua", null, 450);

        //INSTANCIAND TREINADOR
        Treinador t = new Treinador();
        t.setNome("Victor");
        //ADD POKEMONS AO TREINADOR
        t.addPokemon(po);
        t.addPokemon(po2);
        t.addPokemon(po3);

        //FOR PARA PERCORRER OS POKEMONS
        for (int i = 0; i < t.pokemons.length; i++) {
            if (t.pokemons[i] != null) {
                if (t.pokemons[i] instanceof Bulbassaur) {//CASTING PARA BULBASSAURO
                    Bulbassaur b = (Bulbassaur) t.pokemons[i];
                    if (b.helditem != null)
                        b.setLuminosidadeAmbiente(b.getLuminosidadeAmbiente() + 300);
                    b.getLuminosidadeAmbiente();
                    b.atacar();
                    b.ataqueEspecial();
                    b.fazerBarulho();
                    b.mostraInfo();
                } else if (t.pokemons[i] instanceof Squirtle) {//CASTING PARA SQUIRTLE
                    Squirtle s = (Squirtle) t.pokemons[i];
                    s.getMultiplicdorAgua();
                    s.atacar();
                    s.ataqueEspecial();
                    s.fazerBarulho();
                    s.mostraInfo();
                } else {//CASTING PARA PIKACHU
                    Pikachu p = (Pikachu) t.pokemons[i];
                    if (p.helditem != null)
                        p.setSoltaRaios(p.getSoltaRaios() + 200);
                    p.getParalisisaEletrica();
                    p.getSoltaRaios();
                    p.atacar();
                    p.ataqueEspecial();
                    p.fazerBarulho();
                    p.mostraInfo();
                }
            }
        }
    }
}