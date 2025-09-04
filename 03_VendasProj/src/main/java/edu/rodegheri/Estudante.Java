package edu.rodegheri;

public class Estudante extends ClientePF {
    private String instituicao;

    public Estudante(int codigo, 
                     String nome, 
                     String endereco,
                     String umCpf,
                     String umaInstituicao) {
        super(codigo, nome, endereco, umCpf);
        this.instituicao = umaInstituicao;
    }

    @Override
    public String getNome() {
        return super.getNome() + " (" + 
               this.instituicao + ")";
    }
    
    @Override
    public String toString() {
        return super.toString() + " Estuda na " +this.instituicao;
    }
    
}