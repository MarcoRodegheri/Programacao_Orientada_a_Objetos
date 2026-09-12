package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {

    public enum Status {CONFIRMADO, ATRASADO, CANCELADO};

    private LocalDateTime dataHora;
    private Status status;

    public Voo(LocalDateTime dataHora) {
        this.dataHora = dataHora;
        this.status = Status.CONFIRMADO;
    }

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status novo) {
        this.status = novo;
    }

    public abstract Rota getRota();

    public abstract Duration getDuracao();

    @Override
    public String toString() {
        return "\nData e hora: " + this.dataHora + "\nStatus: " + this.status;
    }
}
