package org.example;

public class Professor extends Funcionario{

    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n----------INFORMACOES DO PROFESSOR----------");
        System.out.println("Nome do funcionario: " + getNome());
        System.out.println("Idade do funcionario: " + getIdade());
        System.out.println("salario do funcionario: " + getSalario());
        System.out.println("Materia do professor: "+materia);
    }

    public void corrigirProvas(){
        System.out.println("O professor " +getNome()+ "esta corrigindo prova" );
    }

    @Override
    public void executaAcao() {
        System.out.println("o professor "+ getNome()+" esta dando aula");
    }
}


