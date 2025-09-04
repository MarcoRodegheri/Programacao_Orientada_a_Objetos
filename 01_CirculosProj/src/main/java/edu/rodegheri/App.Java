package edu.rodegheri;

public class App {

    public static void main(String[] args){
        System.out.print("\f");

        Circulo vC[] = new Circulo [3];
        Quadrado vQ[] = new Quadrado [2];
        Triangulo vT[] = new Triangulo [2];

        Circulo c1 = new Circulo ();
        vC[0] = c1;

        Ponto p2 = new Ponto (1,2);
        Circulo c2 = new Circulo (p2,3);
        vC[1] = c2;

        Ponto p3 = new Ponto (4,5);
        Circulo c3 = new Circulo (p3,6);
        vC[2] = c3;
        
        Quadrado q1 = new Quadrado ();
        vQ[0] = q1;

        Quadrado q2 = new Quadrado (p3,6);
        vQ[1] = q2;

        Triangulo t1 = new Triangulo ();
        vT[0] = t1;

        Triangulo t2 = new Triangulo (p3,3,3,3);
        vT[1] = t2;
        
        for(Circulo c : vC){
           System.out.println(c);
        }

        for(Quadrado q : vQ){
            System.out.println(q);
        }

        for(Triangulo t : vT){
            System.out.println(t);
        }

        System.out.println("\nMudando...");
        
        c1.moverCirculo(7,8);
        c2.moverCirculo(9,10);
        c2.zoom(11);

        q1.moverQuadrado(7,8);
        q2.moverQuadrado(9,10);
        q2.zoom(13);

        t1.moverTriangulo(7,8);
        t2.moverTriangulo(9,10);
        t2.zoom(12);
        
        for(Circulo c : vC){
            System.out.println(c);
        }

        for(Quadrado q : vQ){
            System.out.println(q);
        }

        for(Triangulo t : vT){
            System.out.println(t);
        }

        System.out.println("Area circulo 2: "+c2.area());
        System.out.println("Area quadrado 2: "+q2.area());
        System.out.println("Area triangulo 2: "+t2.area());
    }
}