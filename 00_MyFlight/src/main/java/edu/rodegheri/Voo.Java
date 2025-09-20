package edu.rodegheri;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo{

    public enum Status {CONFIRMADO, ATRASADO, CANCELADO};

    private LocalDateTime dataHora;
    private Duration duracao;
    private Rota rota;
    private Status status;

    public Voo(LocalDateTime dataHora, Duration  duracao, Rota rota){
        this.dataHora = dataHora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = Status.CONFIRMADO;   
    }

    public LocalDateTime getDataHora(){
        return this.dataHora;
    }

    public Duration getDuracao(){
        return this.duracao;
    }

    public Rota getRota(){
        return this.rota;
    }

    public Status getStatus(){
        return this.status;
    }

    public void setStatus(Status novo){
        this.status = novo;
    }

    public String toString(){
        return "\nData e hora: "+this.dataHora+"\nDuração:"+this.duracao+"\nRota: "+this.rota+"\nStatus: "+this.status;
    }
}