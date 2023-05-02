package org.example;

public class Arquiteto extends Funcionario
{

    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n----------INFORMACOES DO ARQUITETO----------");
        System.out.println("Nome do funcionario: " + getNome());
        System.out.println("Idade do funcionario: " + getIdade());
        System.out.println("salario do funcionario: " + getSalario());
        System.out.println("Especialidade do arquiteto: " +especialidade);
}



    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void executaAcao() {
        System.out.println("O arquiteto " + getNome() + " esta planejando um predio");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() +700;
    }
}
