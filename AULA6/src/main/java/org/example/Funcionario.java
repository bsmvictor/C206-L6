package org.example;

public class Funcionario {

    private static int cont = 0;
    public String nome; //POR PADRÃO JA É PUBLIC
    public int id;
    private  int salario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        cont++;
        this.id = id = cont;
        this.salario = salario;
    }

    public void mostraInfo() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Id: " + this.id);
    }

    //APENAS MOSTRAR
    public static int getCont() {
        return cont;
    }

    //APENAS MUDAR
    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
