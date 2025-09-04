package edu.rodegheri;

import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> lista;

    // ia funcionar assim, mas EU... não gosto...
    // private ArrayList<Produto> lista = new ArrayList<>();

    public CadastroProdutos() {
        lista = new ArrayList<>();
    }

    // método "cadastrar" tem sobrecarga
    //.   ==> dependendo dos parâmetros usa um 
    //        ou outro método
    public void cadastrar(Produto prod) {
        lista.add(prod);
    }

    public void cadastrar(int codigo, String nnnn, double preco) {
        Produto prod = new Produto(codigo, nnnn, preco);
        lista.add(prod);

        // ou... sendo econômico... apenas:
        //lista.add( new Produto(codigo, nome, preco) );
    }

    public Produto pesquisar(int codigo) {
        // usando for tradicional
        for (int i = 0; i<lista.size();i++) {
            // pega o produto da posicao i
            Produto p = lista.get(i);
            // verifica se é o que estou produrando
            if ( p.getCodigo() == codigo) {
                return p;
            }

            // ou sendo corajoso, inadequado para 
            // primeiro semestre
            //if ( lista.get(i).getCodigo() == codigo)
            //    return lista.get(i);
        }
        // a linha a seguir (for each) faz exatamente
        //.    o mesmo que as duas linhas acima
        //for(Produto p : lista) {
        //    if ( p.getCodigo() == codigo) {
        //        return p;
        //    }
        //}

        // passei por todos e não achei (depois do for)
        return null;
    }

    public String relatorio() {
        StringBuilder rel = new StringBuilder();

        // forma tradicional
        for (int i=0; i<lista.size(); i++) {
            Produto prod = lista.get(i);
            rel.append(prod.toString());
            rel.append("\n");
        }

        // tema: reescrever com foreach

        return rel.toString();
    }

}

