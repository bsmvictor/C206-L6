package org.example;

public class Nave {
    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma;

    //adicionando arma como composicao
    public Nave(String nome, int velocidade, boolean velocidadeDaLuz, String tipoarma, int forcaarma) {
        System.out.println("nova nave criada!");
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;

        //Agregacao
        //this.arma = arma;

        //Composicao
        this.arma = new Arma(tipoarma, forcaarma);
    }


    public void MostraInfo(){
        System.out.println("Nome da nave: " + this.nome);
        System.out.println("velocidade da nave: " + this.velocidade);
        System.out.println("Tipo da arma: " + this.arma.tipo);
        System.out.println("Forca da arma: " + this.arma.forca);
    }

    public void viajarVelocidadeDaLuz(){
        if(this.velocidadeDaLuz == true){
            System.out.println("viaja em velocidade da luz");
        }
        else
            System.out.println("Nao viaja em velocidade da luz");
    }

    public void addArma(Arma arma){
        System.out.println("arma foi adicionada");
        this.arma = arma;

    }
}
