package br.com.joaocarloslima;

public class Batata {
    private int tamanho = 1;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public void crescer() {
        tempoDeVida++;
        if (tamanho < 4 && tempoDeCrescimento % tempoDeVida == 0) {
            tamanho++;
        }
    }

    public Boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }

}
