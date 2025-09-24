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

/*
 * public class Voo{
 * public enum Status {CONFIRMADO, ATRASADO, CANCELADO}
 * 
 * private LocalDateTime dataHora;
 * private Duration duracao;
 * private Rota rota;
 * private Status status;
 * 
 * public Voo(LocalDateTime dataHora, Duration duracao, Rota rota){
 * this.dataHora = dataHora;
 * this.duracao = duracao;
 * this.rota = rota;
 * this.status = Status.CONFIRMADO;
 * }
 * 
 * public Voo(Duration duracao, Rota rota){
 * this.dataHora = LocalDateTime.of(2016, 8, 12, 12, 0);
 * this.duracao = duracao;
 * this.rota = rota;
 * this.status = Status.CONFIRMADO;
 * }
 * 
 * public LocalDateTime getdataHora(){
 * return this.dataHora;
 * }
 * 
 * public Duration getDuracao(){
 * return this.duracao;
 * }
 * 
 * public Rota getRota(){
 * return this.rota;
 * }
 * 
 * public Status getStatus(){
 * return this.status;
 * }
 * 
 * public void setStatus(Status novo){
 * this.status = novo;
 * }
 * 
 * public void setRota(Rota rota){
 * this.rota = rota;
 * }
 * 
 * @Override
 * public String toString(){
 * return
 * "\nData e hora: "+this.dataHora+"\nDuração:"+this.duracao+"\nRota: "+this.
 * rota+"\nStatus: "+this.status;
 * }
 * }
 */