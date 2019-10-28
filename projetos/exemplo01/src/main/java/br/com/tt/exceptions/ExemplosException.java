package br.com.tt.exceptions;

import java.io.FileNotFoundException;

public class ExemplosException {

    public static void main(String[] args)
    //throws NumeroInvalidoException
    {
        System.out.println("Entrou no main");
        try {
            validaNumero();
//        //Multicatch
//        }catch (NumeroInvalidoException | IllegalArgumentException | NullPointerException e) {
//            System.out.println("Entrou na exeção");
//            e.printStackTrace();

        }catch (NumeroInvalidoException e) {
            System.out.println("Entrou na exeção");
            e.printStackTrace();

        }catch (IllegalArgumentException e){
            System.out.println("Ocorreu Illegal!!! ".concat(e.getMessage()));

        }finally {
            System.out.println("Sempre vai entrar no finally!!");
        }
        System.out.println("Saiu do main");
    }
    public static void validaNumero() throws NumeroInvalidoException{
        System.out.println("Entrou no validaNumero");

        String numero = null;//"a";

        if(numero == null){
            throw new IllegalArgumentException("Número deveria ser informado!!!");
        }

        if(numero.equals("12") == false){
            throw new NumeroInvalidoException();
        }
        System.out.println("Terminou o validaNumero");
    }



}
