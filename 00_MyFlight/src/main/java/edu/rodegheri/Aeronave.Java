package edu.rodegheri;

public class Aeronave implements Contavel{

    private String codigo;
    private String descricao;
    private int capacidade;

    private static int contObj = 0;

    public Aeronave(String codigo, String descricao, int capacidade){
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
        contObj++;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getCapacidade(){
        return this.capacidade;
    }   

    public int getTotal(){
        return contObj;
    }

    public String toString(){
        return "\nCódigo: "+this.codigo+"\nDescrição: "+this.descricao+"\nCapacidade: "+this.capacidade;
    }

}