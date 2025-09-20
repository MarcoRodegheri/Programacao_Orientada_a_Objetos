package edu.rodegheri;

import java.util.ArrayList;

public class GerenciadorCias{

    private ArrayList<CiaAerea> empresas;

    public GerenciadorCias(){
        this.empresas = new ArrayList<>();
    }

    public void adicionar(CiaAerea cia){
        this.empresas.add(cia);
    }

    public ArrayList<CiaAerea> listarTodas(){
        return this.empresas;
    }

    public CiaAerea buscarCodigo(String cod){
        for(CiaAerea c: empresas){
            if(c.getCodigo().equalsIgnoreCase(cod))
                return c;
        }            

        return null;
    }

    public CiaAerea buscarNome(String cod){
        for(CiaAerea c: empresas){
            if(c.getNome().equalsIgnoreCase(cod))
                return c;
        }

        return null;
    }

}