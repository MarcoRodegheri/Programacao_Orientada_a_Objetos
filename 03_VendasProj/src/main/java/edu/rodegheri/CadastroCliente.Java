package edu.rodegheri;

import java.util.ArrayList;

public class CadastroClientes {
    private ArrayList<Cliente> lista;

 
    public CadastroClientes() {
        lista = new ArrayList<>();
    }


    public void cadastrar(Cliente cli) {
        lista.add(cli);
    }

    // quero pesquisar pelo cpf, cnpj ou passaporte...
    public Cliente pesquisar(String codigo) {
        for (Cliente cli : lista) {
            if ((cli.getID()).equals(codigo))
                return cli;
        }
        return null;
    }

    public String relatorio() {
        StringBuilder rel = new StringBuilder("\nCadastro de clientes\n");
        
        for (Cliente c : lista) {
            rel.append(c.toString());
            rel.append("\n");
        }

        return rel.toString();
    }

}