package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int [] arrayInt = {10,20,30,40,50,60,70,80,90,100};
        //System.out.println(arrayInt[2]);

        /*
        Livro[] livros = new Livro[10];

        Livro l1 = new Livro("Diario de um banana", 300);
        livros[0] = l1;

        livros[1] = new Livro("Jogos Vorazes", 400);

        for (int i = 0; i < livros.length; i++){

            if(livros[i] != null) {
               livros[i].mostraInfo();
            }
        }

         */

        Livro[] livros = new Livro[10];

        Biblioteca b1 = new Biblioteca();
        b1.nome = "Bilac Pinto";

        boolean flag = true;

        while (flag) {
            System.out.println("BEM VINDO AO MENU DA BIBLIOTECA: " + b1.nome);
            System.out.println("1-Cadastrar novo livro");
            System.out.println("2-Mostrar informacoes do livro");
            System.out.println("3-Sair do menu");

            int op;
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.print("CADASTRE UM NOVO LIVRO!");
                    in.nextLine();

                    System.out.print("Entre com o nome do livro: ");
                    String nomeLivro = in.nextLine();

                    System.out.print("Entre com a quantidade de paginas: ");
                    int qtdpag = in.nextInt();

                    Livro l = new Livro(nomeLivro, qtdpag);

                    b1.addLivro(l);

                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    b1.mostraInfo();
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("Entre com um numero valido");
                    break;
            }
        }


    }
}