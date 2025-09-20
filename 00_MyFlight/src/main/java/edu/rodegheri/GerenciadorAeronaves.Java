package edu.rodegheri;

import java.util.ArrayList;

public class GerenciadorAeronaves{

    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        this.aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao){
        this.aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas(){
        return this.aeronaves;
    }

    public Aeronave buscarPorCodigo(String cod){
        for(Aeronave a: aeronaves){
            if(a.getCodigo().equalsIgnoreCase(cod))
                return a;
        }

        return null;
    }

}