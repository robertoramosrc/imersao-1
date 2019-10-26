package br.com.tt.colecoes;

import java.util.*;

public class ExemplosColecoes {

    public static void main(String[] args) throws InterruptedException {
//        listaSimples();
//        interacaoArrayList();
//        listaSemDuplicacoes();
//        mapSimples();
        mostrandoTempo();
    }

    private static void mostrandoTempo() throws InterruptedException {

        long inicio = System.currentTimeMillis();

        //Seu código aqui

        long fim = System.currentTimeMillis();

        System.out.println("Tempo em milis: "+ (fim-inicio));


    }

    private static void mapSimples() {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Porto Alegre");
        mapa.put(8, "Rio de Janeiro");
        mapa.put(3, "São Paulo");
        mapa.put(null, "São Luis");

        System.out.println("Foreach - TreeMap");
        for (Map.Entry entry : mapa.entrySet()){
            System.out.println(
                    String.format("Chave: %d - %s",
                            entry.getKey(),
                            entry.getValue()));
        }
        mapa.remove(3);
        System.out.println("Foreach - keyset - TreeMap");
        for (Integer key : mapa.keySet()){
            System.out.println(
                    String.format("Chave: %d - %s",
                            key,
                            mapa.get(key)));
        }
    }

    public static void listaSemDuplicacoes(){
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(8);
        numeros.add(1);
        numeros.add(Integer.valueOf(2));

        System.out.println("\nForeach - TreeSet: ");
        for (Integer numero : numeros){
            System.out.println(numero);
        }

        System.out.println("\nIterator - TreeSet: ");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


    private static void interacaoArrayList() {
        List<String> lista = new LinkedList<>();
        lista.add("Java");
        lista.add("PHP");
        lista.add("C#");
        lista.add("JS");

        System.out.println("\n\nFOR: ");
        for (int i=0; i< lista.size();i++){
            System.out.println(lista.get(i));
        }

        Collections.sort(lista);
        lista.add("Zim");
        lista.add("PowerBuilder");

        System.out.println("\n\nFOREACH");
        for(String valor : lista){
            System.out.println(valor);
        }

        lista.sort(Collections.reverseOrder());

        System.out.println("\n\nIterator: ");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void listaSimples(){

        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("1");
        lista.add(Integer.valueOf(1).toString());

        System.out.println(lista.get(0));
        System.out.println(lista.size());

        System.out.println(lista.remove("Java"));
        System.out.println(lista.size());

        System.out.println(lista.remove("Java"));
        //System.out.println(lista.get(0)); - exceção!
    }

}
