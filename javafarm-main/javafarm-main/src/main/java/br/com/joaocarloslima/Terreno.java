package br.com.joaocarloslima;

public class Terreno {
    private Planta planta;
    private int x, y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Planta p) {
        if (!estaOcupado()) {
            this.planta = p;
        }
    }

    public void colher(Celeiro celeiro) {
        if (planta != null && planta.podeColher()) {
            celeiro.armazenar(planta);
            this.planta = null;
        }
    }

    public boolean estaOcupado() {
        return planta != null;
    }

    public Planta getPlanta() {
        return planta;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
