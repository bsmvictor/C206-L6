package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[5];

        Arquiteto a1 = new Arquiteto("Anna", 19 , 500, "Predial");
        /*
        a1.setNome("Anna");
        a1.setIdade(19);
        a1.setSalario(500);
        a1.setEspecialidade("Predial");

        a1.mostraInfo();
        a1.executaAcao();
        System.out.println(a1.salarioBonus());

         */

        Engenheiro e1 = new Engenheiro("Victor", 20, 1000, "Computacao");
        /*
        e1.setNome("Victor");
        e1.setIdade(20);
        e1.setSalario(1000);
        e1.setRamo("Computacao");

        e1.mostraInfo();
        e1.executaAcao();

         */

        Professor p1 = new Professor("Chris", 30, 5000, "poo");
        /*
        p1.setNome("Chris");
        p1.setIdade(30);
        p1.setSalario(5000);
        p1.setMateria("POO");

        p1.mostraInfo();
        p1.corrigirProvas();
        p1.executaAcao();

         */

        funcionarios[0] = a1;
        funcionarios [1]=e1;
        funcionarios[2] = p1;

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i]!=null){
                if(funcionarios[i] instanceof Engenheiro){
                    Engenheiro e = (Engenheiro) funcionarios[i];
                    e.mostraInfo();
                } else if (funcionarios[i] instanceof Professor) {
                    Professor p = (Professor) funcionarios[i];
                    p.mostraInfo();
                } else if (funcionarios[i] instanceof Arquiteto) {
                    Arquiteto a = (Arquiteto) funcionarios[i];
                    a.mostraInfo();
                }
            }
        }
    }
}