package br.com.tt.exemplos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class ExercicioStrings {

    public static void main(String[] args) {
        concatenaStrings();
        usoDoStringBuffer();
        usoDoStringBuilder();
        cuidadoComOsOctaisEHexas();
        conversaoDeString();
        converteIntEmString();
    }

    private static void converteIntEmString() {
        int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105, 115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97, 111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97, 33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115, 32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

        String texto = "";
        for (int n : numeros){
            char caractere = (char) n;
            texto = texto.concat(Character.toString(caractere));
        }
        System.out.println(texto);
    }

    private static void conversaoDeString() {

        System.out.println("conversaoDeString: ");

        int numero = Integer.parseInt("123");
        System.out.println(numero);

        Long numeroLongo = Long.parseLong("1235000");
        System.out.println(numeroLongo);

        BigDecimal valor = new BigDecimal(Double.parseDouble("123.78")).setScale(2, RoundingMode.DOWN);
        System.out.println(valor);
        valor.pow(2); //potencia de 1
        BigDecimal multiplicacao = valor.multiply(BigDecimal.valueOf(3)); //multiplicacao
        System.out.println(multiplicacao);

        BigInteger inteiroGigante = new BigInteger("3423423423423423424242342342342423423423423423");
        System.out.println(inteiroGigante);

        System.out.println(valor.divide(BigDecimal.valueOf(4), 2, RoundingMode.DOWN));
    }


    private static void cuidadoComOsOctaisEHexas() {
        System.out.println(034); // 28 decimal
        System.out.println(0034); // 28 decimal
        System.out.println(0x10); // 16 decimal
    }

    private static void usoDoStringBuilder() {
        String onde = "Target Trust";
        int tempo = 4;

        String stringFinal = new StringBuilder()
                .append("Eu trabalho na ")
                .append(onde)
                .append(" há ")
                .append(tempo)
                .append(" anos.")
                .toString();

        System.out.println(stringFinal);
    }

    private static void concatenaStrings() {
//        "" + "" - evitar
        "a".concat("b");
        new String("c").concat("b");
        String.valueOf("a").concat("b");

        String nome = "Fulano";
        System.out.println(String.format("Bem vindo %s!", nome));


        String frase = new String();

        frase = frase.concat(String.valueOf('O'));
        frase = frase.concat(String.valueOf('L'));
        frase = frase.concat(String.valueOf('á'));

        System.out.println(frase);

    }

    private static void usoDoStringBuffer() {
        String nome = "Gilberto";
        String profissao = "Dev.";

        StringBuffer sb = new StringBuffer();
        sb.append("Nome: ");
        sb.append(nome);
        sb.append(". Profissão: ");
        sb.append(profissao);

        System.out.println(sb.toString());
    }


}
