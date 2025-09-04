package edu.rodegheri;

public class ProdutoAlcoolico extends Produto {

    private double impostoBebum;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco) {
        super(umCodigo, umNome, umPreco);
        this.impostoBebum = 1.5;
    }

    @Override
    public double getPreco() {
        double taxaBebum = super.getPreco() * impostoBebum;
        
        return super.getPreco() + taxaBebum;
    }
    
    @Override
    public String toString() {

        // pode ser assim, mas fica feio e ineficiente...
        //return "("+codigo+") \t "+nome+" \t R$ "+preco;

        return String.format("%s - Imposto extra: %.0f%%",
                    super.toString(),
                    this.impostoBebum * 100);

    }

}
