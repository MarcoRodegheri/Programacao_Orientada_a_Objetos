package edu.rodegheri;

public class Comercial extends Imovel {

    public Comercial(String proprietario, int areaConstruida, Geo loc){
        super( proprietario,  areaConstruida,  loc);
    }

    public double calculaImposto(){
        return 0;
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
}
