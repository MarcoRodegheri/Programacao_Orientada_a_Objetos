package edu.rodegheri;

public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(Produto umProduto) {
        this.quantidade = 1;
        this.prod = umProduto;
    }

    public ItemVenda(int qtde, Produto umProduto) {
        this.quantidade = qtde;
        this.prod = umProduto;
    }

    public double getValor() {
        return quantidade * prod.getPreco();
    }

    public Produto getProduto() {
        return prod;
    }

    @Override
    public String toString() {
        return String.format("%-10s \t %3d \t R$ %5.2f",
                             prod.getNome(),
                             quantidade,
                             this.getValor());
    }
}