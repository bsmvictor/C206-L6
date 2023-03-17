package org.example;

public class Funcionario {

    //atributos
    String nome;
    int idade;
    int cpf;
    float salario;

    /*public Funcionario(String nome, int idade, int cpf, float salario) {
        System.out.println("Criou um funcionario!");
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }
     */

    //metodos
    public void tirarFerias(String mes, int dias) {
        System.out.println("O funcionario " + nome + " tirou ferias no mes de " + mes + " durante " + dias + " dias.");
    }

    public float salarioAnual() {
        float salarioAnual = salario * 12;
        return salarioAnual;
    }

    public float salarioAnual(float decimoterceiro){
        float salarioAnual = salario *12;
        return  salarioAnual + decimoterceiro;
    }

    public float salarioAnual(float decimoterceiro, float decimoquarto){
        float salarioAnual = salario * 12;
        return salarioAnual + decimoterceiro + decimoquarto;
    }
}
