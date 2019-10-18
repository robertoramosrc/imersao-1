public class IntroducaoExercicio01 {

    public static void main(String[] args) {
        //1.  Imprima todos os números de 150 a 300.
        imprimirNumeros150a300();

        //2.  Imprima a soma de 1 até 1000.
        imprimirSoma1ate1000();

        //3.  Imprima todos os múltiplos de 3, entre 1 e 100.
        imprimirMultiposde3ate100();

        //4. Encontra e imprime o menor número da lista a seguir: 88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567
        encontraEImprimeMenorNumero();

        //5.  Imprima os fatoriais de 1 a 10.
        imprimirFatoriais1a10();

        /*6. No código do exercício anterior, aumente a quantidade de números que terão os fatoriais
        impressos, até 20, 30, 40. Em um determinado momento, além desse cálculo  demorar,
        vai  começar  a mostrar respostas completamente erradas. Por quê?
        Mude de  int  para  long  para ver alguma mudança.*/
        imprimirFatoriaisAte20();

        /*7. Imprima  o fibonacci de 50
        Os números seguintes são sempre a soma dos dois números anteriores.
        Portanto, depois de 0 e 1, vêm 1, 2, 3, 5, 8, 13, 21, 34.
        Atenção para o 0 e o 1, que terão de retonar sempre 1 para não dar zerar o cálculo...
        * */
        imprimirFibonacci();
    }

    private static void encontraEImprimeMenorNumero() {
        int[] numeros = {88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};

        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("O menor é: "+ menor);
    }

    private static void imprimirFibonacci() {
        int input = 30;
        int fibo = fibonacci(input);
        System.out.println("Fibo de "+input+" = "+fibo);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int fibo = fibonacci(n - 1) + fibonacci(n - 2);
            return fibo;
        }
    }

    private static void imprimirFatoriaisAte20() {

        System.out.println("imprimirFatoriaisAte20: ");

        int entrada = 20;

        //Trocando para long para não estourar o int
        long fatorial = 0;
        for( int i = 0; i <= entrada; i++ ) {
            if(i <= 1){
                fatorial = 1;
            }else{
                fatorial *= i;
            }
            System.out.println(i + "!: " + fatorial);
        }
        System.out.println("-------------------------");

    }

    //Cálculo de potência
    private static long potencia(int x, int potencia) {

        //Atenção, se não for long em potências de 16 já estoura o limite do INT
        long resultado = 1;

        for(int i = 1; i <= potencia; i++ ) {
            resultado *= x;
        }

        System.out.println("(" + x + ") elevado na "+ potencia +" = " + resultado);

        return resultado;
    }

    private static void imprimirFatoriais1a10() {

        System.out.println("imprimirFatoriais1a10: ");

        int entrada = 10;

        int fatorial = 0;
        for( int i = 0; i <= entrada; i++ ) {
            if(i <= 1){
                fatorial = 1;
            }else{
                fatorial *= i;
            }
            System.out.println(i + "!: " + fatorial);
        }
        System.out.println("-------------------------");

    }

    private static void imprimirMultiposde3ate100() {

        System.out.println("imprimirMultiposde3ate100: ");

        for (int i = 1; i <= 100; i++) {

            boolean isMultiplo = (i % 3 == 0);

            if(isMultiplo){
                System.out.println("Múltiplo de 3: "+ i);
            }
        }
        System.out.println("-------------------------");

    }

    private static void imprimirSoma1ate1000() {

        System.out.println("imprimirSoma1ate1000: ");

        //Atenção para o <= pois se não ficará em 999
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
            System.out.println("i = "+ i + "-> " + soma);
        }
        System.out.println("-------------------------");

    }

    private static void imprimirNumeros150a300() {

        System.out.println("imprimirNumeros150a300: ");
        //Atenção para o <= pois se não ficará em 299
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
    }
}
