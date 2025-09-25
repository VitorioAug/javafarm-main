package br.com.joaocarloslima;

public class Morango extends Planta {
    public Morango() {
        this.tempoDeCrescimento = 4; // Exemplo
    }


    public String getImagem() {
        return "images/morango" + tamanho + ".png";
    }


    public String getNome() {
        return "Morango";
    }
}

