package edu.rodegheri;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos{

    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        this.aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero){
        this.aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return this.aeroportos;
    }

    public Aeroporto buscarPorCodigo(String cod){
        for(Aeroporto a: aeroportos){
            if(a.getCodigo().equalsIgnoreCase(cod)){
                return a;
            }
        }

        return null;
    }

    public void ordenaNome(){
        Collections.sort(this.aeroportos);
    }

}