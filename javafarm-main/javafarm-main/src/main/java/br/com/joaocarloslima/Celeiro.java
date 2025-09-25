package br.com.joaocarloslima;
//sou lindo cara
public class Celeiro {
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro(int capacidade) {
        this.capacidade = capacidade;
        this.qtdeBatatas = 0;
        this.qtdeCenouras = 0;
        this.qtdeMorangos = 0;
    }

    public void armazenarBatata() {
        if (!celeiroCheio()) qtdeBatatas++;
    }

    public void armazenarCenoura() {
        if (!celeiroCheio()) qtdeCenouras++;
    }

    public void armazenarMorango() {
        if (!celeiroCheio()) qtdeMorangos++;
    }

    public void consumirBatata() {
        if (qtdeBatatas > 0) qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras > 0) qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos > 0) qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - getOcupacao();
    }

    public int getOcupacao() {
        return qtdeBatatas + qtdeCenouras + qtdeMorangos;
    }

    public boolean celeiroCheio() {
        return getOcupacao() >= capacidade;
    }

    public double getProgresso() {
        return (double) getOcupacao() / capacidade;
    }

    public int getQtdeBatatas() { return qtdeBatatas; }
    public int getQtdeCenouras() { return qtdeCenouras; }
    public int getQtdeMorangos() { return qtdeMorangos; }
}
