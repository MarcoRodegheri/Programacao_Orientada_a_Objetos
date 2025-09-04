package edu.rodegheri;

import java.time.LocalDate;

// Herança...
// extends --> ProdutoEE "é um tipo de " Produto
public class ProdutoEE extends Produto {
    // não preciso repetir os atributos
    //private int codigo;
    //private String nome;
    //private double preco;

    // apenas adiciono o que tem a mais...
    private int diasGarantia;

    public ProdutoEE(int umCodigo, 
                     String umNome, 
                     double umPreco, 
                     int diasGarantia) {
        // "procura" na SuperClasse um construtor que
        // receba por parâmetro: (int, String, double)
        super(umCodigo, umNome,umPreco);
        this.diasGarantia = diasGarantia;
    }

    public int getDiasGarantia() {
        return diasGarantia;
    }

    public String getGarantia() {
        LocalDate hoje = LocalDate.now();
        
        return "\nProduto :"  + this.getNome() + "\n"+
               "Garantia: " + this.diasGarantia + " dias\n" +
               "Data compra: " + hoje + "\n"+
               "Vence em: " + hoje.plusDays(diasGarantia);
    }


    @Override
    public String toString() {

        // pode ser assim, mas fica feio e ineficiente...
        //return "("+codigo+") \t "+nome+" \t R$ "+preco;

        // posso fazer assim, mas não parece bom...
        //return String.format("(%d) \t %s \t R$ %.2f - Garantia %d dias",
        //            this.getCodigo(),
        //            this.getNome(),
        //            this.getPreco(),
        //            this.diasGarantia);

        // mas vou fazer assado (assim):
        return String.format("%s - Garantia %d dias",
                    super.toString(),
                    this.diasGarantia);

    }

}