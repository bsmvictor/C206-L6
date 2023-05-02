package org.example;

public class Engenheiro extends Funcionario implements Gerencia{

    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n----------INFORMACOES DO ENGENEHRIO----------");
        System.out.println("Nome do funcionario: " + getNome());
        System.out.println("Idade do funcionario: " + getIdade());
        System.out.println("salario do funcionario: " + getSalario());
        System.out.println("Ramo do engenherio: " + ramo);
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void executaAcao() {
        System.out.println("O engenheiro " + getNome() + " esta trabalhando");
    }

    @Override
    public void gerencia() {

    }
}
