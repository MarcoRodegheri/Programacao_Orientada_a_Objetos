package edu.rodegheri;

public class Aeroporto{

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

    public String toString(){
        return "\nCódigo: "+this.codigo+"\nNome: "+this.nome+"\nLocalização: "+this.loc;
    }
}