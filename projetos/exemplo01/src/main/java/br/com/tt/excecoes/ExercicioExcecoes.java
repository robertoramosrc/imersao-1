package br.com.tt.excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExercicioExcecoes {

    public static void main(String args[]) throws Exception {
        excecoesNumericas();
        nullPointerException();
        indexOfBounds();
        arquivoInexistente();
        erroDeConversao();
        disparoDeExcecao();
    }

    private static void disparoDeExcecao() {
        throw new IllegalArgumentException();
    }

    private static void erroDeConversao() {
        int num = Integer.parseInt ("zero");
        System.out.println(num);
    }

    private static void arquivoInexistente() throws FileNotFoundException {
        File file = new File("E://arquivo.txt");
        FileReader fr = new FileReader(file);
    }

    private static void indexOfBounds() {
        String e = "Imersao Java";
        char f = e.charAt(29);
        System.out.println(e);
    }

    private static void nullPointerException() {
        String d = null;
        System.out.println(d.charAt(0));
    }

    private static void excecoesNumericas() {
        int a = 30, b = 0;
        int c = a/b;
        System.out.println ("Resultado = " + c);
    }
}
