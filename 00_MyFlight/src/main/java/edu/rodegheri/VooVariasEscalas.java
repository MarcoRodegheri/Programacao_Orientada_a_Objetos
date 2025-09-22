package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo {

    private ArrayList<Voo> variasEscalas = new ArrayList<>();;

    public VooVariasEscalas(LocalDateTime dataHora, Duration  duracao, Rota rota, ArrayList<Voo> listaVoo){
       super(dataHora, duracao, rota);

       this.variasEscalas.add(new Voo(getDataHora(), getDuracao(), getRota()));
       this.variasEscalas.addAll(listaVoo);
       setRota(new Rota(variasEscalas.get(0).getRota().getCiaAerea(), 
                        variasEscalas.get(0).getRota().getOrigem(), 
                        variasEscalas.get(variasEscalas.size()-1).getRota().getDestino(),
                        variasEscalas.get(0).getRota().getAeronave()));

          
    }

    public ArrayList<Voo> getVariasEscalas() {
        return this.variasEscalas;
    }

    @Override
    public String toString() {
        return super.toString() + "Escalas: " + this.variasEscalas;
    }
}
