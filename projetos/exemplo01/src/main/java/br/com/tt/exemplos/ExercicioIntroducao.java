package br.com.tt.exemplos;

public class ExercicioIntroducao {

    public static void main(String[] args) {
        imprimeTodosOsNumerosDe150a300();
        imprimeSomaDe1Ate1000();
        imprimeMultiplosDe3();
        imprimeMenorValorLista();
        imprimeFatoriaisDe1a10();
        imprimeFatoriaisAte100();
        imprimeFibonacci();

//        int fibo = fibonacci(30);
//        System.out.println("Fibo de 30: "+ fibo);
    }

    //- (1) crie um método que: Imprima todos os números de 150 a 300.
    public static void imprimeTodosOsNumerosDe150a300() {

        System.out.println("Números de 150 a 300: ");
        for (short numero = 150; numero <= 300; numero++) {
            System.out.println(numero);
        }
    }

    //- (2) crie um método que: Imprima a soma de 1 até 1000.
    public static void imprimeSomaDe1Ate1000() {
        int soma = 0;
        for (int contador = 1; contador <= 1000; contador++) {
            soma += contador;
            System.out.println("Soma até " + contador + ": " + soma);
        }
    }

    //- (3) crie um método que: Imprima todos os múltiplos de 3, entre 1 e 100.
    public static void imprimeMultiplosDe3() {
        for (int contador = 3; contador <= 100; contador = contador + 3) {
            System.out.println("Múltiplo de 3: " + contador);
        }
    }

    //- (4) crie um método que: Encontra e imprime o menor número da lista a seguir: 88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567
    public static void imprimeMenorValorLista() {

        int[] lista = {88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};

        int menor = lista[0];
//        for (int posicao=1;posicao< lista.length; posicao++){
//            if(lista[posicao] < menor){
//                menor = lista[posicao];
//            }
//        }

        for (int elemento : lista) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        System.out.println("Menor valor: " + menor);
    }

    //- (5) crie um método que: Imprima os fatoriais de 1 a 10.
    public static void imprimeFatoriaisDe1a10() {

        int fatorial = 1;
        for (int posicao = 2; posicao <= 10; posicao++) {
            fatorial = posicao * fatorial;
            System.out.println("Fatorial de " + posicao + " " + fatorial);
        }
    }

    //- (6) crie um método copiando o exercício (4), mas aumente a quantidade de números que
    // terão os fatoriais impressos, até 20, 50, 100.
    public static void imprimeFatoriaisAte100() {

        long fatorial = 1;
        for (int posicao = 2; posicao <= 100; posicao++) {
            fatorial = posicao * fatorial;
            System.out.println("Fatorial de " + posicao + " " + fatorial);
        }
    }

    // 7. Imprima  o fibonacci de 30.
    //    Os números seguintes são sempre a soma dos dois números anteriores.
    //            Portanto, depois de 0 e 1, vêm 1, 2, 3, 5, 8, 13, 21, 34.
    public static void imprimeFibonacci() {

        int[] fibos = new int[31];
        for (int contador = 0; contador <= 30; contador++) {

            if (contador <= 1) {
                fibos[contador] = contador;

            } else {
                fibos[contador] = fibos[contador - 1] + fibos[contador - 2];
            }
            System.out.println("Fibo de " + contador + ": " + fibos[contador]);
        }
    }

    public static void imprimeFibonacciRecursivo() {

        int[] fibos = new int[31];
        for (int contador = 0; contador <= 30; contador++) {

            if (contador <= 1) {
                fibos[contador] = contador;

            } else {
                fibos[contador] = fibos[contador - 1] + fibos[contador - 2];
            }
            System.out.println("Fibo de " + contador + ": " + fibos[contador]);
        }
    }

    public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return fibonacci(numero-1) + fibonacci(numero - 2);
        }
    }
}