package edu.rodegheri;

public class Ponto
{
    private int coordX;
    private int coordY;
    
    public Ponto(){
        this.coordX = 0;
        this.coordY = 0;
    }
    public Ponto(int coordX, int coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void setCoordX (int coordX){
        this.coordX = coordX;
    }
    public void setCoordY (int coordY){
        this.coordY = coordY;
    }

    public int getCoordX (){
        return this.coordX;
    }
    public int getCoordY (){
        return this.coordY;
    }

    public void moverPonto(int x, int y){
        this.setCoordX(x);
        this.setCoordY(y);
    }

    @Override
    public String toString(){
        return "Coordenadas - ("+this.coordX+","+this.coordY+")";
    }
}