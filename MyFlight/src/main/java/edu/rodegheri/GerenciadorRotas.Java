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

    public void ordenaNome() {
        Collections.sort(this.rotas);
    }

}