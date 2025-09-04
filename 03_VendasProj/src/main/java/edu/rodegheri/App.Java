package edu.rodegheri;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto(123,"Lapis", 2.5);
        System.out.println(p1);

        // para usar o cadastro de produtos temos de "pegar" a instancia
        //CadastroProdutos cadProd = CadastroProdutos.getInstance();

        // agora que tenho a instância posso usar...
        //cadProd.cadastrar(p1);   // depois de criar o método cadastrar...
        
        CadastroProdutos cadProdutos = new CadastroProdutos();
        cadProdutos.cadastrar(123, "Lapis", 2.5);
        cadProdutos.cadastrar(124, "Caneta", 5);
        cadProdutos.cadastrar(125, "Borracha", 4.5);

        System.out.println("\n");
        System.out.println(cadProdutos.toString());
        System.out.println();

        Produto p = cadProdutos.pesquisar(123);
        if ( p != null) {
            System.out.println("\nAchou: "+p.toString());
            // testando a classe ItemVenda
            // só para teste, esta classe só "existe" 
            //     dentro da classe Venda
            ItemVenda iv1 = new ItemVenda(10, p);
            System.out.println("ItemVenda: " + iv1.toString());


        } else {
            System.out.println("\nProduto 123 não está no cadastro");
        }

        p = cadProdutos.pesquisar(200);
        if ( p != null) {
            System.out.println("\nAchou: "+p.toString());
        } else {
            System.out.println("\nProduto 200 não está no cadastro");
        }

        Cliente cli1 = new Estudante(1,
                                     "Huguinho",
                                    "Av. Brasil, 1",
                                    "111-11",
                                    "PUCRS");
        System.out.println("\n");
        Venda venda1 = new Venda(cli1);
        venda1.inserir(10, cadProdutos.pesquisar(123));
        venda1.inserir(2, cadProdutos.pesquisar(125));
        venda1.inserir(cadProdutos.pesquisar(124));

        System.out.println(venda1.fecharVenda());

        ProdutoEE pEE = new ProdutoEE(323,"Ferro de passar", 200, 180);
        System.out.println("\n\n"+ pEE);

        ProdutoAlcoolico pA = new ProdutoAlcoolico(523,"Korote", 10);
        System.out.println("\n\n" + pA);
        
        System.out.println("\nValor de uma Korote: R$ " + pA.getPreco());

        cadProdutos.cadastrar(pEE);
        cadProdutos.cadastrar(pA);


        System.out.println("\n- - - Cadastro de produtos - - -\n");
        System.out.println(cadProdutos.toString());
     
        Cliente cli2 = new ClientePJ(2,"Biscoitos do Zé","Av. Brasil, 1","222/0002-2");
        System.out.println("\n");
        Venda venda2 = new Venda(cli2);
        venda2.inserir(20, cadProdutos.pesquisar(123));
        venda2.inserir(10, cadProdutos.pesquisar(523));
        venda2.inserir(cadProdutos.pesquisar(323));

        System.out.println(venda2.fecharVenda());

        // erro - não posso dar new em classes abstratas
        //Cliente cli3 = new Cliente(3,"John Doe", "av. Canoas");

        CadastroClientes cadCli = new CadastroClientes();
        cadCli.cadastrar(cli1);
        cadCli.cadastrar(cli2);
        cadCli.cadastrar(new ClientePF(3, "huginho", "disney", "333-33"));
        cadCli.cadastrar(new ClientePJ(4, "Patinhas inc", "nao info", "444/0004"));
        
        System.out.println(cadCli.relatorio());

        Cliente c = cadCli.pesquisar("111-11");

        System.out.println("\n\nresultado da pesquisa 1:");
        System.out.println( c.toString() );

        Cliente c2 = cadCli.pesquisar("444/0004");

        System.out.println("\n\nresultado da pesquisa 2:");
        System.out.println( c2.toString() );

        System.out.println("\n\nPróxima venda será nro: " +
                            Venda.getProximoNumeroNF());

    }
}