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

    public void plantar(int x, int y, Planta planta) {
        getTerreno(x, y).plantar(planta);
    }

    public void colher(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (t != null) {
            t.colher(celeiro);
        }
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.stream()
                .filter(t -> t.getX() == x && t.getY() == y)
                .findFirst()
                .orElse(null);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}

