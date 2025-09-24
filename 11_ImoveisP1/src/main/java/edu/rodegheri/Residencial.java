package edu.rodegheri;

public class Residencial extends Imovel {

    private int areaTerreno;

    public Residencial(String proprietario, int areaConstruida, Geo loc, int areaTerreno) {

        super(proprietario, areaConstruida, loc);
        this.areaTerreno = areaTerreno;

    }

    public int getAreaTerreno() {
        return this.areaTerreno;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0;
        double aC = super.getAreaConstruida();

        if (aC <= 200) {
            imposto = 0;

        } else {
            imposto += (aC - 200) * Imovel.getVR();
        }

        if (this.areaTerreno > 1000) {
            imposto += 100 * Imovel.getVR();
        }

        return imposto;
    }

    @Override
    public String toString(){
        String mostrar = super.toString()+"\nArea do Terreno: "+this.areaTerreno;

        if(calculaImposto() > 100){
            mostrar = mostrar+ "\nImposto Extra do Terreno é de: "+100 * Imovel.getVR();
        }

        return mostrar;
    }

}
