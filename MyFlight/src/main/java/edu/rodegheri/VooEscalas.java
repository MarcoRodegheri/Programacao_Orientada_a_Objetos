package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {
    
    private ArrayList<Rota> rotas;

    private static final double VELOCIDADE = 805.0;
    private static final int MINUTOS_PADRAO_POR_TRECHO = 30;

    public VooEscalas(LocalDateTime dataHora) {
        super(dataHora);
        this.rotas = new ArrayList<>();
    }

    public void adicionaRota(Rota r) {
        if (r != null) {
            rotas.add(r);
        }
    }

    @Override
    public Rota getRota() {
        return rotas.isEmpty() ? null : rotas.get(0);
    }

    public ArrayList<Rota> getRotas() {
        return this.rotas;
    }

    @Override
    public Duration getDuracao() {
        double totalMinutos = 0.0;

        for (Rota r : rotas) {
            double km = Geo.distancia(r.getOrigem().getLoc(), r.getDestino().getLoc());
            double horasVoo = km / VELOCIDADE;
            totalMinutos += horasVoo * 60.0;
        }

        totalMinutos += rotas.size() * MINUTOS_PADRAO_POR_TRECHO;

        long minutosArredondados = Math.round(totalMinutos);
        return Duration.ofMinutes(minutosArredondados);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (rotas.isEmpty()) {
            sb.append("Não há rotas!");
        } else {
            sb.append(" - ");
            for (int i = 0; i < rotas.size(); i++) {
                if (i > 0) {
                    sb.append(" -> ");
                }
                sb.append(rotas.get(i).getOrigem().getCodigo())
                  .append("->")
                  .append(rotas.get(i).getDestino().getCodigo());
            }
            sb.append(" (duração: ").append(formatDuration(getDuracao())).append(")");
        }
        return sb.toString();
    }

    private String formatDuration(Duration d) {
        long min = d.toMinutes();
        long h = min / 60;
        long m = min % 60;
        return String.format("%dh %02dm", h, m);
    }
}
