package org.example;

public class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] ninjas = new Ninja[50];

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    public void adicionarNinja(Ninja ninja) {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] == null) {
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("\n-----INFORMACOES DA ALDEIA E SEUS NINJAS-----");
        System.out.println("\nNome: " + this.nome);
        System.out.println("Num de moradores: " + this.qtdMoradores);
        System.out.println("Regiao: " + this.regiao);
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                ninjas[i].mostraInfo();
            }
        }
    }

    public void raking() {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null && ninjas[i].ranking.equals("S"))
                System.out.println("\nNinjas no rank S: " + ninjas[i].nome);

        }
    }

    public void qtdTitulos() {
        int gen = 0;
        int chu = 0;
        int an = 0;
        int i = 0;

        for (i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null && ninjas[i].titulo.equals("Gennin"))
                gen++;

            else if (ninjas[i] != null && ninjas[i].titulo.equals("Chunnin"))
                chu++;

            else if (ninjas[i] != null && ninjas[i].titulo.equals("ANBU"))
                an++;
        }
        System.out.println("----------------------------------");
        System.out.println("Qtd de ninjas Gennin: " + gen);
        System.out.println("Qtd de ninjas Chunnin: " + chu);
        System.out.println("Qtd de ninjas ANBU: " + an);
    }
}
