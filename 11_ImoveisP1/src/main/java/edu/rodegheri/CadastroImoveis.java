package edu.rodegheri;

import java.util.ArrayList;

public class CadastroImoveis {

    private ArrayList<Imovel> imoveis = new ArrayList<>();

    public void add(Imovel elem){
        imoveis.add(elem);
    }

    public void listar(){
        double total=0;

        StringBuilder sb = new StringBuilder();
        for(Imovel im : imoveis){
            sb.append(im.toString());
            sb.append("\n");
            total += im.calculaImposto();
        }

        sb.append("\nImposto Total: "+ total);
        System.out.println(sb.toString());
    }

    public String listar(String proprietario){
        StringBuilder sb = new StringBuilder();
        for (Imovel im : imoveis) {
            if(im.getPropriertario().equals(proprietario)){
                sb.append(im.toString());
                if(im instanceof Residencial){
                    sb.append("\nTipo: Residencial");
                }
                else{
                    sb.append("\nTipo Comercial");
                }
            }
        }

        return sb.toString();
    }


    
}
