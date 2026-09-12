package edu.rodegheri;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
        this.rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota) {
        this.rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        return this.rotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig) {

        ArrayList<Rota> listaOrigem = new ArrayList<>();

        for (Rota r : rotas) {
            if (r.getOrigem().getCodigo().equalsIgnoreCase(orig.getCodigo()))
                listaOrigem.add(r);
        }

        return listaOrigem;
    }

    public ArrayList<Rota> buscarPorDestino(Aeroporto dest) {

        ArrayList<Rota> listaDestino = new ArrayList<>();

        for (Rota r : rotas) {
            if (r.getDestino().getCodigo().equalsIgnoreCase(dest.getCodigo()))
                listaDestino.add(r);
        }

        return listaDestino;
    }

    public void ordenaNome() {
        Collections.sort(this.rotas);
    }

}