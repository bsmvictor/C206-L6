package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BEM VINDO AO ALMOXERIFADO");
        System.out.println("RESISTOR | CAPACITOR | PROTOBOARD");
        System.out.println("FACA SUA REQUISICAO");

        //Entrada de Dados
        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();

        switch (componente) {
            case "RESISTOR":
                System.out.println("Requisitou um resistor");
                break;

            case "CAPACITOR":
                System.out.println("Requisitou um capacitor");
                break;

            case "PROTOBOARD":
                System.out.println("Requisitou uma protoboard");
                break;

            default:
                System.out.println("Nao possuimos no nosso estoque");
                break;
        }
    }
}