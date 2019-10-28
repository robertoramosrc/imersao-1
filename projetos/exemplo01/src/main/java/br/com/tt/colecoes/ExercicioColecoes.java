package br.com.tt.colecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExercicioColecoes {

    public static void main(String[] args) throws FileNotFoundException {

//        leArquivoOrdenandoPorNome();
//        imprimeNomesOrdenandoSemRepeticoes();
//        imprimeNomesOrdenandoSemRepeticoesUsandoSet();
        criarHashMapAPartirDoArquivo();
    }

    /*
    * Crie um método que retorna todos os campos de cada linha em um hashmap com as chaves
     * (nome, sobrenome, telefone, salario)
     */
    private static void criarHashMapAPartirDoArquivo() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:\\temp\\input3.csv"));
        System.out.println("Linha ignorada: ".concat(scanner.nextLine()));

        List<HashMap<String, String>> pessoas = new ArrayList();

        while (scanner.hasNextLine()) {
            String[] partesDaLinha = scanner.nextLine().split(",");

            HashMap<String, String> pessoa = new HashMap<>();
            pessoa.put("nome", partesDaLinha[0]);
            pessoa.put("sobrenome", partesDaLinha[1]);
            pessoa.put("telefone", partesDaLinha[2]);
            pessoa.put("salario", partesDaLinha[3]);

            pessoas.add(pessoa);
        }

        for (HashMap<String, String> pessoa: pessoas) {
            System.out.println(pessoa.get("nome")+" "+pessoa.get("sobrenome")+" ganha "+pessoa.get("salario"));
        }

    }

    public static void leArquivoOrdenandoPorNome() throws FileNotFoundException {

        ArrayList<String> listaNomes = (ArrayList<String>) leArquivo(new ArrayList());

        Collections.sort(listaNomes);
//        listaNomes.sort(Comparator.naturalOrder());

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }

    public static void imprimeNomesOrdenandoSemRepeticoes() throws FileNotFoundException {

        Collection<String> lista = leArquivo(new ArrayList());

        ArrayList<String> listaSemDuplicacoes = new ArrayList<>();

        for (String nome : lista) {
            if (!listaSemDuplicacoes.contains(nome)) {
                listaSemDuplicacoes.add(nome);
            }
        }

        Collections.sort(listaSemDuplicacoes);

        for (String nome : listaSemDuplicacoes) {
            System.out.println(nome);
        }
    }

    public static void imprimeNomesOrdenandoSemRepeticoesUsandoSet() throws FileNotFoundException {

        Collection<String> lista = leArquivo(new TreeSet());

        for (String nome : lista) {
            System.out.println(nome);
        }
    }

    public static void leArquivoRetornandoHashMap() {

    }

    public static Collection<String> leArquivo(Collection listaNomes) throws FileNotFoundException {

        final int POSICAO_NOME = 0;

        Scanner scanner = new Scanner(new File("C:\\temp\\input3.csv"));
        System.out.println("Linha ignorada: ".concat(scanner.nextLine()));

        while (scanner.hasNextLine()) {
            String[] linha = scanner.nextLine().split(",");
            boolean adicionado = listaNomes.add(linha[POSICAO_NOME]);

            if (Boolean.FALSE.equals(adicionado)) {
                System.out.println("Duplicado: ".concat(linha[POSICAO_NOME]));
            }
        }

        return listaNomes;
    }

}
