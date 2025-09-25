package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Celeiro {
    private int capacidade;
    private List<Planta> armazenadas;

    public Celeiro(int capacidade) {
        this.capacidade = capacidade;
        this.armazenadas = new ArrayList<>();
    }

    public void armazenar(Planta planta) {
        if (!celeiroCheio()) {
            armazenadas.add(planta);
        }
    }

    public void consumir(String nomePlanta) {
        for (int i = 0; i < armazenadas.size(); i++) {
            if (armazenadas.get(i).getNome().equalsIgnoreCase(nomePlanta)) {
                armazenadas.remove(i);
                break;
            }
        }
    }

    public int getEspacoDisponivel() {
        return capacidade - armazenadas.size();
    }

    public int getOcupacao() {
        return armazenadas.size();
    }

    public boolean celeiroCheio() {
        return getOcupacao() >= capacidade;
    }

    public double getProgresso() {
        return (double) getOcupacao() / capacidade;
    }

    public int contarPorTipo(String nomePlanta) {
        return (int) armazenadas.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nomePlanta))
                .count();
    }

    public List<Planta> getPlantas() {
        return armazenadas;
    }
}
