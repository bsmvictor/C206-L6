package org.example;

public class Main {
    public static void main(String[] args) {
        //criado funcionario
        Funcionario f1 = new Funcionario();

        f1.nome = "victor";
        f1.idade = 21;
        f1.cpf = 14134316;
        f1.salario = 500;

        //metodos do funcionario f1
        System.out.print("Salario anual do " + f1.nome + " eh: ");
        System.out.println(f1.salarioAnual());

        f1.tirarFerias("junho", 27);

        //---------------------------------------------------------------------------------------//

        Funcionario f2 = new Funcionario();

        f2.nome = "Yves";
        f2.idade = 20;
        f2.cpf = 6543548;
        f2.salario = 400;

        //metodos do funcionario f2
        System.out.print("Salario anual do " + f2.nome + " eh: ");
        System.out.println(f1.salarioAnual());

        //---------------------------------------------------------------------------------------//

        f1 = f2;

        if(f1 == f2){ //f1 recebe os metodo e atributos de f2
            System.out.println("sao os mesmo objetos");
        }
        else
            System.out.println("sao objetos diferentes");

    }
}