package edu.rodegheri;

public class Quadrado 
{
    private Ponto ponto;
    private double lado;
    private double zoom;
    
    public Quadrado(){
        this.ponto = new Ponto();
        this.lado = 1;
        this.zoom = 1;
    }
    public Quadrado(Ponto ponto, double lado){
        this.ponto = ponto;
        this.lado = lado;
        this.zoom = 1;
    }

    public void setPonto(Ponto ponto){
        this.ponto = ponto;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public void setZoom(double zoom){
        this.zoom = zoom;
    }

    public Ponto getPonto(){
        return this.ponto;
    }
    public double getLado(){
        return this.lado;
    }
    public double getZoom(){
        return this.zoom;
    }

    public void moverQuadrado(int x, int y){
        this.ponto.setCoordX(x);
        this.ponto.setCoordY(y);
    }
    public void zoom(double zoom){
        this.zoom = this.lado * zoom;
    }
    public double area(){
        return Math.pow(lado,2);
    }
    
    @Override
    public String toString(){
        return "\n"+this.ponto+"\nLado: "+this.lado+"\nZoom: "+this.zoom;
    }
}