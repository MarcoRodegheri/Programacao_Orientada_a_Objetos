package edu.rodegheri;

public abstract class Imovel {
    
    private String proprietario;
    private int areaConstruida;
    private Geo loc;

    private static double VR;

    public Imovel(String proprietario, int areaConstruida, Geo loc){
        this.proprietario = proprietario;
        this.areaConstruida = areaConstruida;
        this.loc = loc;
    }

    public String getPropriertario(){
        return this.proprietario;
    }

    public int getAreaConstruida(){
        return this.areaConstruida;
    }

    public Geo getLoc(){
        return this.loc;
    }

    public static double getVR(){
        return Imovel.VR;
    }

    public static void setVR(double val){
        Imovel.VR = val;
    }


    public abstract double calculaImposto();

    public String toString(){
        return "\nProprietário: "+this.proprietario+"\nArea Construida: "+this.areaConstruida+"\nLocalização: "+this.loc+"\nImposto: "+calculaImposto();
    }
}
