package edu.rodegheri;

public class Aeroporto implements Comparable<Aeroporto>{

    private String codigo;
    private String nome;
    private Geo loc;
    
    public Aeroporto(String codigo, String nome, Geo loc){
        this.codigo = codigo;
        this.nome = nome;
        this.loc = loc;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public Geo getLoc(){
        return this.loc;
    }

    @Override
    public int compareTo(Aeroporto outro){
        return this.nome.compareTo(outro.getNome());
    }

    @Override
    public String toString(){
        return "\nCódigo: "+this.codigo+"\nNome: "+this.nome+"\nLocalização: "+this.loc;
    }
}