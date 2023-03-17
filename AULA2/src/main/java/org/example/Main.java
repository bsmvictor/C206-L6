package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //AULA VARIAVEIS PRIMITIVAS

        /*
        double saldoDaConta;
        double saldo_da_conta;

        int NUMERO_ALUNOS = 18;

        String nome = "Vicor";

        double numDouble = 1.54;
        float numFloat;

        numFloat = (float) numDouble;

        System.out.println(numFloat);


        //ENTRADA DE DADOS

        System.out.println("Entre cm um numero Double: ");
        double numDouble = entrada.nextDouble();

        System.out.println("Entre cm um numero int: ");
        int numInt = entrada.nextInt();

        System.out.println("Entre cm um numero Float: ");
        float numFloat = entrada.nextFloat();

        entrada.nextLine(); //entrar com uma string

        System.out.println("Entre com o seu nome: ");
        String seuNome = entrada.nextLine();

        */

        //CALCULO DO IMC

        Scanner entrada = new Scanner(System.in);

        float seuPeso = 0;
        float suaAltura = 0;

        System.out.print("\nENTRE COM O SEU PESO: ");
        seuPeso = entrada.nextFloat();


        System.out.print("\nENTRE COM A SUA ALTRA: ");
        suaAltura = entrada.nextFloat();

        float imc = seuPeso / (suaAltura * suaAltura);

        if (imc < 18.5)
            System.out.println("\nABAIXO DO PESO");

        else if (imc >= 18.5 && imc <= 24.9)
            System.out.println("\nPESO NORMAL");

        else if (imc >= 25 && imc <= 29.9)
            System.out.println("\nSOBREPESO");

        else if (imc >= 30 && imc <= 34.9)
            System.out.println("\nOBESIDADE GRAU I");

        else if (imc >= 35 && imc <= 39.9)
            System.out.println("\nOBESIDADE GRAU II");

        else
            System.out.println("\nOBESIDADE GRAU III");


    }
}