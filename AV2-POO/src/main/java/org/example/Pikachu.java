package org.example;

public class Pikachu extends Pokemon implements AtaqueEspecial, FazerBarulho{
    private int soltaRaios;
    private float paralisisaEletrica;

    public Pikachu(String nome, String tipo, HeldItem helditem, int soltaRaios) {
        super(nome, tipo, helditem);
        this.soltaRaios = soltaRaios;
        this.paralisisaEletrica = paralisisaEletrica;
    }

    public int getSoltaRaios() {
        return soltaRaios;
    }

    public void setSoltaRaios(int soltaRaios) {
        this.soltaRaios = soltaRaios;
    }

    public float getParalisisaEletrica() {
        return paralisisaEletrica;
    }

    public void setParalisisaEletrica(float paralisisaEletrica) {
        this.paralisisaEletrica = paralisisaEletrica;
    }

    @Override
    public void ataqueEspecial() {
        if (getSoltaRaios() > 750)
            System.out.println(getNome() + " conseguiu ganhar de seu oponente");
        else
            System.out.println(getNome() + " perdeu a batalha");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }
}
