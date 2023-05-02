package org.example;

public class Bulbassaur extends Pokemon implements AtaqueEspecial, FazerBarulho{
    private int luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, HeldItem helditem, int luminosidadeAmbiente) {
        super(nome, tipo, helditem);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    public int getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }

    public void setLuminosidadeAmbiente(int luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }


    @Override
    public void ataqueEspecial() {
        if (getLuminosidadeAmbiente() > 650)
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
