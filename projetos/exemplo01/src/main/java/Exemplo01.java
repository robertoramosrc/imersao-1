import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        condicional();
        condicao2();
        caracteres();
        numerosLongos();
//        switchCase();
        lacos();
        arrays();
    }

    public static void arrays(){

        int valor[] = {12, 24, 36};
        valor[1] = 25;

        int posicao = 1;

        if (valor.length > posicao){
            System.out.println("Valor:"+ valor[posicao]);
        }

        int[] valores = new int[200];
        valores[99] = 1;

        //copiar array valor para o array valores... com FOR :)
        //valores[0] = valor[0];
        //valores[1] = valor[1];
        for (int pos = 0; pos < valor.length; pos++){
            valores[pos] = valor[pos];
        }

        for (int pos=0;pos<valores.length;pos++){
            System.out.println(pos + ": "+ valores[pos]);
        }


        System.out.println("Valor:"+ valores[0]);


    }

    public static void lacos() {

        int valor = 10;

        while (valor <= 20){
            if(valor == 15){
                valor++;
                continue;
            }
            System.out.println("Executou: "+(valor+++1));
            //valor = valor+1;
            //valor += 1;
            //valor++;
            //++valor;
        }

        do {
            valor +=2;
            System.out.println("Do while:"+valor);
        }while (valor < 30);

        outroFor: for (;;){

             meuFor: for (valor = 40; valor < 500;valor++){
                System.out.println("For: "+valor);
                if (valor%61 == 0){
                    break outroFor;
                }
            }

        }

    }

    public static void switchCase() {

        System.out.println("Digite um inteiro: ");
        int valorEntrada = new Scanner(System.in).nextInt();

        System.out.println(valorEntrada);

        switch (valorEntrada) {

            case 0:
                System.out.println("Valor inválido!");
                break;
            case 1:
                System.out.println("Executada opção 1");
                break;
            case 2:
                System.out.println("Executada opção 2");
                break;
            default:
                System.out.println("Nenhuma opção informada!");
        }
    }

    public static void numerosLongos() {
        int quatidadeProdutos = (int) ((long) 2312312);
        System.out.println("quatidadeProdutos: " + quatidadeProdutos);

        long quantidadeEmEstoque = 12222000053534534L;
        System.out.println(quantidadeEmEstoque);

        float bonificacao = 122255234234.1213F;

        double valorVendas = (long) 12312312312.24D;//Conversao para tipo menor!!
        System.out.println(valorVendas);
    }

    public static void caracteres() {
        char letra = 'A';
        System.out.println(letra);

        char letra2 = 65;
        System.out.println(letra2);

        char letra3 = (int) '2';
        System.out.println(letra3);

        int letra4 = (int) 'A';
        System.out.println(letra4);

        int letra5 = (int) 'A';
        char letra6 = (char) letra5;
        System.out.println(letra6);

        int letra7, letra8, letra9;
        letra7 = 12;
        letra7 = letra5;
        System.out.println(letra5 == letra7);

        if (letra7 > 5) {
            System.out.println("Letra 7 maior que 5");
        }
    }

    public static void condicional() {
        boolean condicao = 2 > 1;

        if (condicao) {
            System.out.println("Entrou na condição");
        } else {
            System.out.println("Fora da condicao");
        }
    }

    public static void condicao2() {
        short entrada = 123;

        if (entrada < 0) {
            System.out.println("Entrada negativa!");
        } else if (entrada < 10) {
            System.out.println("Entrada menor que 10");
        } else {
            System.out.println("Valor acima de 10");
        }
    }


}
