package edu.rodegheri;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int umCodigo, String umNome, double umPreco) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.preco = umPreco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {

        // pode ser assim, mas fica feio e ineficiente...
        //return "("+codigo+") \t "+nome+" \t R$ "+preco;

        return String.format("(%d) \t %s \t R$ %.2f",
                    this.codigo,
                    this.nome,
                    this.preco);

    }

}