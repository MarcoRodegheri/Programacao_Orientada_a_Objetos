package edu.rodegheri;

import java.util.ArrayList;
import java.time.LocalDate;

public class GerenciadorVooDiretos{

    private ArrayList<VooDireto> vooDiretos;

    public GerenciadorVooDiretos(){
        this.vooDiretos = new ArrayList<>();
    }

    public void adicionar(VooDireto vooDireto){
        this.vooDiretos.add(vooDireto);
    }

    public ArrayList<VooDireto> listarTodos(){
        return this.vooDiretos;
    }

    public ArrayList<VooDireto> buscarData(LocalDate data){

        ArrayList<VooDireto> listaVooDiretos = new ArrayList<>();

        for(VooDireto v: vooDiretos){
            if(v.getDataHora().toLocalDate().equals(data))
                listaVooDiretos.add(v);
        }

        return listaVooDiretos;
    }
}