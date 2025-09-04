package edu.rodegheri;

public class ClientePF extends Cliente {
    private String cpf;

      public ClientePF(int codigo, 
                     String nome, 
                     String endereco,
                     String umCpf) {
        super(codigo, nome, endereco);
        this.cpf = umCpf;
    }

    public String getCPF() {
        return cpf;
    }

    @Override
    public String getID() {
        return this.cpf;
    }

    public String toString() {
        return super.toString() + " CPF: " +this.cpf;
    }
    
}