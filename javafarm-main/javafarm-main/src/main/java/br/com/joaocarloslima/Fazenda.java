package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        terrenos = new ArrayList<>();
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
        celeiro = new Celeiro(100);
    }

    public void plantarBatata(int x, int y) {
        getTerreno(x, y).plantar(new Batata());
    }

    public void plantarCenoura(int x, int y) {
        getTerreno(x, y).plantar(new Cenoura());
    }

    public void plantarMorango(int x, int y) {
        getTerreno(x, y).plantar(new Morango());
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.stream()
                .filter(t -> t.getX() == x && t.getY() == y)
                .findFirst()
                .orElse(null);
    }

    public void colher(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (t != null) t.colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}
