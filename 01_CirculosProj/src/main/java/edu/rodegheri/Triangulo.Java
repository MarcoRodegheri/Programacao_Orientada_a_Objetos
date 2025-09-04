package edu.rodegheri;

public class Triangulo 
{
    private Ponto ponto;
    private double lado1;
    private double lado2;
    private double lado3;
    private double zoom;
    
    public Triangulo(){
        this.ponto = new Ponto();
        this.lado1 = 1;
        this.lado2 = 1;
        this.lado3 = 1;
        this.zoom = 1;

    }
    public Triangulo(Ponto ponto, double lado1, double lado2, double lado3){
        this.ponto = ponto;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.zoom = 1;
    }

    public void setPonto(Ponto ponto){
        this.ponto = ponto;
    }
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    public void setLado3(double lado3){
        this.lado3 = lado3;
    }
    public void setZoom(double zoom){
        this.zoom = zoom;
    }

    public Ponto getPonto(){
        return this.ponto;
    }
    public double getLado1(){
        return this.lado1;
    }
    public double getLado2(){
        return this.lado2;
    }
    public double getLado3(){
        return this.lado3;
    }
    public double getZoom(){
        return this.zoom;
    }

    public void moverTriangulo(int x, int y){
        this.ponto.setCoordX(x);
        this.ponto.setCoordY(y);
    }
    public void zoom(double zoom){
        this.zoom = (this.lado1 + this.lado2 + this.lado3) * zoom;
    }
    public double area(){
        double s;
        s = (this.lado1 + this.lado2 + this.lado3)/2;
        return Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    }
    
    @Override
    public String toString(){
        return "\n"+this.ponto+"\nLado1: "+this.lado1+"\nLado2: "+this.lado2+"\nLado3: "+this.lado3+"\nZoom: "+this.zoom;
    }
}