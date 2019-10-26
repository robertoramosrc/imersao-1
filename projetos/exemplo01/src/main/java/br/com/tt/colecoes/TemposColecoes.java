package br.com.tt.colecoes;

import java.util.*;

public class TemposColecoes {

    public static void main(String[] args) {
        executa(1000, new ArrayList<>());
        executa(1000, new LinkedList<>());
        executa(1000, new TreeSet<>());
        executa(1000, new HashSet<>());

        executa(50000, new ArrayList<>());
        executa(50000, new LinkedList<>());
        executa(50000, new TreeSet<>());
        executa(50000, new HashSet<>());
    }

    public static void executa(int maximo, Collection<Integer> lista){

        System.out.println(String.format("------> %s - %d",
                lista.getClass().getSimpleName(), maximo));

        long inicio = System.currentTimeMillis();
        for (int i = 0; i<maximo;i++){
            lista.add(i);
        }
        long fimFor = System.currentTimeMillis();

        StringBuilder texto = new StringBuilder();
        for (Integer valor : lista) {
            texto.append(valor);
        }
        long fimForeach = System.currentTimeMillis();

        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            texto.append(iterator.next());
        }
        long fimIterator = System.currentTimeMillis();

        System.out.println("\nAdição: " + (fimFor-inicio));
        System.out.println("Foreach: " + (fimForeach-fimFor));
        System.out.println("Iterator: " + (fimIterator-fimForeach));
    }

}
