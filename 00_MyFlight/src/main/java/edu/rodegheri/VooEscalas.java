package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {

    private Rota rotaFinal;

    public VooEscalas(Rota r1, Rota r2){
        super(dataHora, duracao, rota);
        this.rotaFinal = rotaFinal;
    }

    public VooEscalas(Duration duracao, Rota rota, Rota rotaFinal){
        super(LocalDateTime.of(2016,8,12,12,0), duracao, rota); 
        this.rotaFinal = rotaFinal;
    }
    
}
