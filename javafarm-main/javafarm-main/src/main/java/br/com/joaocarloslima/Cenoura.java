package br.com.joaocarloslima;

public class Cenoura extends Planta {
    public Cenoura() {
        this.tempoDeCrescimento = 2;
    }


    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }

 
    public String getNome() {
        return "Cenoura";
    }
}


