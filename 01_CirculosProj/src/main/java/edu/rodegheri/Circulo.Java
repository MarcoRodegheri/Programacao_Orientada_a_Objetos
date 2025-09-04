package edu.rodegheri;

public class Circulo 
{
    private Ponto ponto;
    private double raio;
    private double zoom;
    
    public Circulo(){
        this.ponto = new Ponto();
        this.raio = 1;
        this.zoom = 1;
    }
    public Circulo(Ponto ponto, double raio){
        this.ponto = ponto;
        this.raio = raio;
        this.zoom = 1;
    }

    public void setPonto(Ponto ponto){
        this.ponto = ponto;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public void setZoom(double zoom){
        this.zoom = zoom;
    }

    public Ponto getPonto(){
        return this.ponto;
    }
    public double getRaio(){
        return this.raio;
    }
    public double getZoom(){
        return this.zoom;
    }

    public void moverCirculo(int x, int y){
        this.ponto.setCoordX(x);
        this.ponto.setCoordY(y);
    }
    public void zoom(double zoom){
        this.zoom = this.raio * zoom;
    }
    public double area(){
        return Math.PI * Math.pow(raio,2);
    }
    
    @Override
    public String toString(){
        return "\n"+this.ponto+"\nRaio: "+this.raio+"\nZooom: "+this.zoom;
    }
}