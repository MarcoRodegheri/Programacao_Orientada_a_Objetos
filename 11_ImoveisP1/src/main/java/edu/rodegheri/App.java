package edu.rodegheri;

public class App{
    public static void main(String args[]){

        Imovel.setVR(50);

        CadastroImoveis ci = new CadastroImoveis();

        Geo loc = new Geo(1,1);
        Residencial res = new Residencial("Marco", 400, loc, 1001);
        Comercial com = new Comercial("Pedro", 793, loc);

        ci.add(res);
        ci.add(com);

        ci.listar();
        System.out.println(ci.listar("Pedro"));
        System.out.println(ci.listar("Marco"));
    }
}