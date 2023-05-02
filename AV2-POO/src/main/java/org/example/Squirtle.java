package org.example;

public class Squirtle extends Pokemon implements AtaqueEspecial, FazerBarulho{

    private float multiplicdorAgua;

    public Squirtle(String nome, String tipo, HeldItem helditem, float multiplicdorAgua) {
        super(nome, tipo, helditem);
        this.multiplicdorAgua = multiplicdorAgua;
    }

    public float getMultiplicdorAgua() {
        return multiplicdorAgua;
    }

    public void setMultiplicdorAgua(float multiplicdorAgua) {
        this.multiplicdorAgua = multiplicdorAgua;
    }

    @Override
    public void ataqueEspecial() {
        System.out.println(getNome() + " soltou ataque especial!");
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
