package org.example;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        Aldeia aldeia = new Aldeia("Inatel", 200, "Minas");

        while (flag) {

            System.out.println("\n----------MENU DA ALDEIA----------");
            System.out.println("\n 1-Cadastrar novo Ninja");
            System.out.println(" 2-Mostrar informacoes");
            System.out.println(" 3-Ninjas rank S");
            System.out.println(" 4-Qtd de ninjas Gennin, Chunnin e ANBU");
            System.out.println(" 5-Sair do sistema");

            int op;
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.print("\nNome do ninja: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Titulo (Gennin, Chunnin ou ANBU): ");
                    String titulo = sc.nextLine();

                    System.out.print("Rank (S,A,B,C ou D): ");
                    String rank = sc.nextLine();

                    Ninja n = new Ninja(nome,idade,titulo,rank);

                    aldeia.adicionarNinja(n);
                    break;

                case 2:
                    aldeia.mostraInfo();
                    break;

                case 3:
                    aldeia.raking();
                    break;

                case 4:
                    aldeia.qtdTitulos();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("INSIRA UM VALOR VALIDO!");
                    break;
            }
        }
    }
}