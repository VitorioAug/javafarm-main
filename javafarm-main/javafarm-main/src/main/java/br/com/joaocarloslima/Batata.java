package br.com.joaocarloslima;

public class Batata extends Planta {
    public Batata() {
        this.tempoDeCrescimento = 3; 
    }


    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }


    public String getNome() {
        return "Batata";
    }
}

