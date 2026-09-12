package edu.rodegheri;

import java.util.ArrayList;
import java.time.LocalDate;

public class GerenciadorVoos{

    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        this.voos = new ArrayList<>();
    }

    public void adicionar(Voo voo){
        this.voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return this.voos;
    }

    public ArrayList<Voo> buscarData(LocalDate data){

        ArrayList<Voo> listaVoos = new ArrayList<>();

        for(Voo v: voos){
            if(v.getDataHora().toLocalDate().equals(data))
                listaVoos.add(v);
        }

        return listaVoos;
    }
}