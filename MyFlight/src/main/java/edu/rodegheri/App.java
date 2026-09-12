package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("               MyFlight — Demonstração POO             ");
        System.out.println("=======================================================\n");

        // ─── 1. Aeroportos reais ───────────────────────────────────────────
        Aeroporto gru = new Aeroporto("GRU",
                "Aeroporto Internacional de São Paulo/Guarulhos",
                new Geo(-23.4356, -46.4731));
        Aeroporto poa = new Aeroporto("POA",
                "Aeroporto Internacional Salgado Filho",
                new Geo(-29.9944, -51.1714));
        Aeroporto gig = new Aeroporto("GIG",
                "Aeroporto Internacional do Rio de Janeiro/Galeão",
                new Geo(-22.8099, -43.2505));

        GerenciadorAeroportos gerAeroportos = new GerenciadorAeroportos();
        gerAeroportos.adicionar(poa);
        gerAeroportos.adicionar(gru);
        gerAeroportos.adicionar(gig);

        System.out.println("──── Aeroportos (antes da ordenação) ────");
        for (Aeroporto a : gerAeroportos.listarTodos()) {
            System.out.println("  " + a.getCodigo() + " - " + a.getNome());
        }

        gerAeroportos.ordenaNome();
        System.out.println("\n──── Aeroportos ordenados por nome (Comparable) ────");
        for (Aeroporto a : gerAeroportos.listarTodos()) {
            System.out.println("  " + a.getCodigo() + " - " + a.getNome());
        }

        // ─── 2. Companhias Aéreas ──────────────────────────────────────────
        CiaAerea latam = new CiaAerea("LA", "LATAM Airlines");
        CiaAerea gol   = new CiaAerea("G3", "GOL Linhas Aéreas");

        GerenciadorCias gerCias = new GerenciadorCias();
        gerCias.adicionar(latam);
        gerCias.adicionar(gol);

        System.out.println("\n──── Companhias Aéreas ────");
        for (CiaAerea c : gerCias.listarTodas()) {
            System.out.println("  [" + c.getCodigo() + "] " + c.getNome());
        }

        // ─── 3. Aeronaves ──────────────────────────────────────────────────
        Aeronave boeing = new Aeronave("B737", "Boeing 737-800", 162);
        Aeronave airbus = new Aeronave("A320", "Airbus A320neo", 174);

        GerenciadorAeronaves gerAeronaves = new GerenciadorAeronaves();
        gerAeronaves.adicionar(boeing);
        gerAeronaves.adicionar(airbus);

        System.out.println("\n──── Interface Contavel (getTotal de Aeronave) ────");
        System.out.println("  Total de aeronaves instanciadas: " + boeing.getTotal());

        gerAeronaves.ordenaDescricao();
        System.out.println("\n──── Aeronaves ordenadas por descrição (Comparable) ────");
        for (Aeronave av : gerAeronaves.listarTodas()) {
            System.out.println("  [" + av.getCodigo() + "] " + av.getDescricao()
                    + " — " + av.getCapacidade() + " lugares");
        }

        Rota rotaPoaGru = new Rota(latam, gru, poa, boeing);
        Rota rotaGruPoa = new Rota(gol,   poa, gru, airbus);
        Rota rotaPoaGig = new Rota(gol,   gig, poa, airbus);

        GerenciadorRotas gerRotas = new GerenciadorRotas();
        gerRotas.adicionar(rotaPoaGru);
        gerRotas.adicionar(rotaGruPoa);
        gerRotas.adicionar(rotaPoaGig);

        LocalDateTime dtVooDireto = LocalDateTime.of(2026, 9, 10, 8, 0);
        VooDireto vd1 = new VooDireto(dtVooDireto, rotaPoaGru);

        LocalDateTime dtVooEscalas = LocalDateTime.of(2026, 9, 10, 14, 0);
        VooEscalas ve1 = new VooEscalas(dtVooEscalas);
        ve1.adicionaRota(rotaGruPoa);
        ve1.adicionaRota(rotaPoaGig);

        LocalDateTime dtOutraData = LocalDateTime.of(2026, 9, 12, 10, 0);
        VooDireto vd2 = new VooDireto(dtOutraData, rotaGruPoa);

        // ─── 6. GerenciadorVoos ────────────────────────────────────────────
        GerenciadorVoos gerVoos = new GerenciadorVoos();
        gerVoos.adicionar(vd1);
        gerVoos.adicionar(ve1);
        gerVoos.adicionar(vd2);

        System.out.println("\n──── Buscar voos do dia 10/09/2026 (buscarData) ────");
        ArrayList<Voo> voosDoDia = gerVoos.buscarData(dtVooDireto.toLocalDate());
        System.out.println("  Voos encontrados: " + voosDoDia.size());
        for (Voo v : voosDoDia) {
            System.out.println("  -> " + v.getDataHora() + " | status: " + v.getStatus()
                    + " | duração: " + formatDuration(v.getDuracao()));
        }

        System.out.println("\n──── Polimorfismo — todos os voos via toString() ────");
        List<Voo> todosVoos = gerVoos.listarTodos();
        for (Voo v : todosVoos) {
            System.out.println("\n[" + v.getClass().getSimpleName() + "]");
            System.out.println(v);
            System.out.println("  getDuracao(): " + formatDuration(v.getDuracao()));
            System.out.println("  getRota() origem: " + v.getRota().getOrigem().getCodigo()
                    + " -> destino: " + v.getRota().getDestino().getCodigo());
        }

        System.out.println("\n=======================================================");
        System.out.println("               Demonstração concluída                  ");
        System.out.println("=======================================================");
    }

    private static String formatDuration(Duration d) {
        long min = d.toMinutes();
        long h   = min / 60;
        long m   = min % 60;
        return String.format("%dh %02dm", h, m);
    }
}
