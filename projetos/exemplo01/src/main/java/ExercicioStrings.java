import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ExercicioStrings {

    public static void main(String[] args) {

//        concatenaStrings();
//        usoDoStringBuffer();
//        usoDoStringBuilder();
//        cuidadoComOsOctaisEHexas();
//        conversaoDeString();
        somaBigDecimal();
    }

    private static void somaBigDecimal() {

        List<BigDecimal> lista = new ArrayList<BigDecimal>();
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.25")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("5.18")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.25")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.15")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("4.17")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.39")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.79")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.18")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.69")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.83")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.74")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.32")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.68")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.29")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.23")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.08")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("5.87")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.05")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.25")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.29")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.83")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.74")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.36")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.58")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.44")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.33")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.30")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.06")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.62")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.94")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.57")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.71")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("5.05")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.66")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.68")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.64")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.48")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("5.91")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.84")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.04")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.42")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.07")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.95")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.72")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("5.98")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.37")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.76")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.39")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("4.61")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.30")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.23")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.54")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.89")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.58")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("5.16")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("4.17")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.23")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.47")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.91")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.25")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.93")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.72")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.87")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.70")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.79")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.82")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.30")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.14")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.24")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("4.46")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.49")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.52")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.48")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.49")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.42")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.73")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.83")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.63")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.45")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("5.10")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.11")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.92")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("4.00")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.08")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.84")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.22")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.17")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("9.02")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.97")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("4.07")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.41")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("8.901")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("4.61")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("1.29")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("7.88")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.61")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("6.10")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.13")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("3.08")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("0.41")));
        lista.add(BigDecimal.valueOf(Double.parseDouble("2.86")));

//        MathContext context = new MathContext(6, RoundingMode.DOWN);

        BigDecimal soma = BigDecimal.ZERO;
        for (BigDecimal bd : lista) {
            soma = soma.add(bd).setScale(2);
        }

        System.out.println(soma);
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
