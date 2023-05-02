package org.example;

public class Escola {
    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante[] estudantes = new Estudante[50];

    public Escola(String nome, String email, int numTelefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    public void addEstudante(Estudante novoEstudante) {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudantes[i] = novoEstudante;
                break;
            }
        }

    }

    public void mostraInfo() {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                estudantes[i].mostraInfo();
            }else
                System.out.println("\nNao existem estudantes cadastrados");
                break;
        }

    }

    public void qtdEstudantePorAno() {
        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;
        int i = 0;

        for (i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null && estudantes[i].ano.equals("primeiro"))
                primeiro++;

            else if (estudantes[i] != null && estudantes[i].ano.equals("segundo"))
                segundo++;

            else if (estudantes[i] != null && estudantes[i].ano.equals("terceiro"))
                terceiro++;
        }
        System.out.println("----------------------------------");
        System.out.println("Qtd alunos Primeiro ano: " + primeiro);
        System.out.println("Qtd alunos Segundo ano: " + segundo);
        System.out.println("Qtd alunos Terceiro ano: " + terceiro);
    }

}
