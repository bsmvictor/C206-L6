package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        Escola escola = new Escola("Inatel", "inatel@inatel.br", 998628466, "Av. monteiro leao caldas");

        while (flag){
            System.out.println("\n----------MENU DA ESCOLA----------");
            System.out.println("\n 1-Cadastrar novo aluno");
            System.out.println(" 2-Mostrar informacoes");
            System.out.println(" 3-Quantidade de alunos em cada ano");
            System.out.println(" 4-Sair do sistema");

            int op = sc.nextInt();

            switch (op){

                case 1:
                    sc.nextLine();
                    System.out.print("\n Nome do estudante:");
                    String nome = sc.nextLine();

                    System.out.print(" Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print(" Ano letivo: ");
                    String ano = sc.nextLine();

                    Estudante es = new Estudante(nome,idade,ano);

                    escola.addEstudante(es);
                    break;

                case 2:
                    escola.mostraInfo();
                    break;

                case 3:
                    escola.qtdEstudantePorAno();
                    break;

                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("INSIRA UM NUMERO VALIDO!");
                    break;
            }

        }
    }
}