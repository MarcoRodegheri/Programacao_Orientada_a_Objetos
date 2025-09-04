package edu.rodegheri;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    // Venda também contém um número de nota fiscal...
    private int numeroNF;

    // vou guardar o número da próxima nota
    // primeira nota será a de número 1000
    // static - atributo não pertence à instância
    //          mas ao conjunto de instâncias de Venda
    // inicialização ( ... = 1000) só acontece uma vez
    //.    ao criar a primeira instância de Venda

    private static int proximoNumeroNF = 1000;
    
 
    public Venda(Cliente umCliente) {
        itens = new ArrayList<>();
        this.cliente = umCliente;

        this.numeroNF = Venda.proximoNumeroNF;

        Venda.proximoNumeroNF = Venda.proximoNumeroNF + 5;

    }

    public static int getProximoNumeroNF() {
        return proximoNumeroNF;
    }

    public void inserir(Produto prod) {
        ItemVenda item = new ItemVenda(1, prod);
        itens.add(item);
    }
    
    public void inserir(int quantidade, Produto prod) {
        ItemVenda item = new ItemVenda(quantidade, prod);
        itens.add(item);
    }

    public double valorTotal() {
        double total = 0;

        for (ItemVenda item : itens) {
            total = total + item.getValor();
        }

        return total;
    }

    public String fecharVenda() {
        // gera a nota de venda
        StringBuilder notaF = new StringBuilder();
                                   
        notaF.append("\nNota de Venda (Exercício Vendas Prj) - POO " +
                         " \t Nota Fiscal: " + this.numeroNF + "\n" );
        notaF.append("\nCliente: ");
        notaF.append(cliente.toString());
        notaF.append("\n");

        for (ItemVenda item : itens) {
            notaF.append("\n   ");
            notaF.append(item.toString());
        }

        notaF.append(String.format("\n\n\t    Valor total: R$ %5.2f",this.valorTotal()));
        notaF.append("\n- - - - - - - - - - - - \"");

        // quero imprimir a garantia dos produtos EE
        for (ItemVenda item : itens) {
            Produto prod = item.getProduto();
            // como saber se prod é um EE
            // --> instanceof : 
            //.   tipo dinâmico (new) de prod é EE ou subclasse de EE?
            if ( prod instanceof ProdutoEE) {
                // se deu verdadiro "é um" EE e tem garantia
                // getGarantia "não é visível no tipo estático Produto"
                //notaF.append(prod.getGarantia());

                // como eu sei que é um produtoEE
                // faço um casting para coverter o formato
                // e tornar o métido getGarantia acessível
                ProdutoEE prodEE = (ProdutoEE) prod;
                notaF.append(prodEE.getGarantia());
                notaF.append("\n- - - - - - - - - - - -\n");


            }

        }

        return notaF.toString();
    }
    
}