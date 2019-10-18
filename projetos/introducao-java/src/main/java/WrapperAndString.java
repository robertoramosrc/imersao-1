public class WrapperAndString {
    public static void main(String[] args) {

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
}
