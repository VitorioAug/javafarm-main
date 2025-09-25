package br.com.joaocarloslima;

public abstract class Planta {
    protected int tamanho = 1;
    protected int tempoDeVida;
    protected int tempoDeCrescimento;

    public void crescer() {
        tempoDeVida++;
        if (tamanho < 4 && tempoDeCrescimento > 0 && tempoDeVida % tempoDeCrescimento == 0) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public abstract String getImagem();

    public abstract String getNome();
}


