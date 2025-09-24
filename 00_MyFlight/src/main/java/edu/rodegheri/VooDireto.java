package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {
    private Rota rota;

    private static final double VELOCIDADE = 805.0;
    private static final int MINUTOS_PADRAO_POR_TRECHO = 30;

    public VooDireto(LocalDateTime dataHora, Rota rota) {
        super(dataHora);
        this.rota = rota;
    }

    @Override
    public Rota getRota() {
        return this.rota;
    }

    @Override
    public Duration getDuracao() {
        double km = Geo.distancia(this.rota.getOrigem().getLoc(), this.rota.getDestino().getLoc());
        double horasVoo = km / VELOCIDADE;
        double minutosVoo = horasVoo * 60.0;

        double totalMinutos = minutosVoo + MINUTOS_PADRAO_POR_TRECHO;
        long minutosArredondados = Math.round(totalMinutos);
        return Duration.ofMinutes(minutosArredondados);
    }
    
    private String formatDuration(Duration d) {
        long min = d.toMinutes();
        long h = min / 60;
        long m = min % 60;
        return String.format("%dh %02dm", h, m);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRota: " + this.rota + "\nDuração: " + formatDuration(getDuracao());
    }

}

/*
 * public class VooEscalas extends Voo {
 * 
 * private Rota rotaFinal;
 * 
 * public VooEscalas(LocalDateTime dataHora, Duration duracao, Rota rota, Rota
 * rotaFinal){
 * super(dataHora, duracao, rota);
 * this.rotaFinal = rotaFinal;
 * }
 * 
 * public VooEscalas(Duration duracao, Rota rota, Rota rotaFinal){
 * super(LocalDateTime.of(2016,8,12,12,0), duracao, rota);
 * this.rotaFinal = rotaFinal;
 * }
 * 
 * public Rota getRotaFinal(){
 * return this.rotaFinal;
 * }
 * 
 * @Override
 * public String toString(){
 * return super.toString() + "\nRota Final: "+this.rotaFinal;
 * }
 * }
 */
