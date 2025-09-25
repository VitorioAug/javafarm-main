package br.com.joaocarloslima;

public class Planta {
    private int tamanho = 1;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public void crescer() {
        tempoDeVida++;
        if(tamanho < 4 && tempoDeCrescimento > 0 && tempoDeVida % tempoDeCrescimento == 0) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem(String nomePlanta) {
        return "images/" + nomePlanta + tamanho + ".png";

    }
    }

