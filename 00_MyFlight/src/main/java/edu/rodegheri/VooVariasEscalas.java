package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo{

    private ArrayList<Voo> variasEscalas;

    public VooVariasEscalas(LocalDateTime dataHora, Duration  duracao, Rota rota, ArrayList<Voo> listaVoo){
       super(dataHora, duracao, rota);

        this.variasEscalas = new ArrayList<>();

        this.variasEscalas.add(new Voo(super.getDataHora(), super.getDuracao(), super.getRota()));
        this.variasEscalas.addAll(listaVoo);
    }

    public ArrayList<Voo> getVariasEscalas(){
        return this.variasEscalas;
    }

    @Override
    public String toString(){
        return super.toString()+"Escalas: "+this.variasEscalas;
    }
}
