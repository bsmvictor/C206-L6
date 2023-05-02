package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //  Joaninha j1 = new Joaninha(10, "vermelho");
        //  Joaninha j2 = new Joaninha(20, "amarelo");
        //  Joaninha j3 = new Joaninha(5, "azul");

        Funcionario f1 = new Funcionario("Yves", 1000);
        Funcionario f2 = new Funcionario("Victor", 5000);
        Funcionario f3 = new Funcionario("Anna", 1200);

        f1.mostraInfo();
        f2.mostraInfo();
        f3.mostraInfo();

        System.out.println(f1.nome + " ganha: " + f1.getSalario());

        //alterando o salario
        f1.setSalario(1200);

        System.out.println(f1.nome + " ganha: " + f1.getSalario());

        //HACKER MUTCHO LOKO
        //Funcionario.cont = 100;


        //System.out.println("\nTemos " + Funcionario.getCont() + " funcionarios na empresa");

        //CADASTRANDO NOVO FUNCIONRIO
        // Funcionario.setCont(4);

        //System.out.println("\nTemos " + Funcionario.getCont() + " funcionarios na empresa");
    }
}