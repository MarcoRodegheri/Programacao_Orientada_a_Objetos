package edu.rodegheri;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
    
      // Criação do ArrayList para armazenar Strings
      
      ArrayList<String> listaStr;

      listaStr = new ArrayList<>();
 
      // Veja como adicionar elementos à lista
      listaStr.add("Fulano");
      listaStr.add("Beltrano");
      listaStr.add("Cicrano");
      listaStr.add("Huguinho");
      listaStr.add("Zezinho");
      listaStr.add("Luizinho");
      //listaStr.add(1);
      //listaStr.add(new Pessoa("Joao", "123"));
 
      // Exibindo a lista
      System.out.println("Lista: "+listaStr);
 
      // Inserindo elementos em determinadas posições
      listaStr.add(0, "Ringo");
      listaStr.add(1, "John");
 
      // Removendo elementos da lista (método retorna true ou false)
      listaStr.remove("Zezinho");
      listaStr.remove("Fulano");
 
      System.out.println("Lista agora é: " + listaStr);
 
      // Removendo elementos de determinada posição
      listaStr.remove(1);
      System.out.println("Lista final: " + listaStr);
 
      Collections.sort(listaStr);
      System.out.println("Lista ordenada: " + listaStr);
 
      // Exibindo cada elemento da lista em uma linha com for
 
      System.out.println(); 
      for(int pos=0; pos < listaStr.size(); pos++) {
          String nome = listaStr.get(pos);
          System.out.println(nome);
      }
      System.out.println();
 
      // Exibindo cada elemento da lista em uma linha com for..each
 
      for(String nome: listaStr) {
          System.out.println(nome);
      }
   

		
		
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("Fulano",  "89672843585");		
		Pessoa p2 = new Pessoa("Ciclano", "89791656282");
		Pessoa p3 = new Pessoa("Beltrano","78657253901");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(0,new Pessoa("Patinhas","123"));

		
		for(int pos=0; pos < lista.size(); pos++) {
			Pessoa p = lista.get(pos);
			System.out.println(p.getNome()+ " - " + p.getCpf());
		}
		System.out.println("\nLista com foreach\n");
		for(Pessoa p : lista) {
			System.out.println(p.getNome()+ " - " + p.getCpf());
		}	
		
        //Collections.sort(lista);

        
        
	}

}