package br.com.tt.exemplos;

import java.util.ArrayList;

public class ExercicioWrapper {

    //Vamos falar sobre: Wrapper, String, autoBoxing, Unboxing, parse, comparação de Classes
    
    public static void main(String[] args) {
        autoBoxingAndUnboxing();
        arrayListCharacter();
        outrosWrappers();
        trabalhandoComStrings();
    }

    private static void trabalhandoComStrings() {
        String a = "meu texto em uma string...";
        String b = a;

        System.out.println(a);
        System.out.println(b);

        System.out.print("igual: ");
        System.out.println(a == b);

        b = a.toLowerCase();
        System.out.print("lower: ");
        System.out.println(a == b);

        b = a.toUpperCase();
        System.out.print("upper: ");
        System.out.println(a == b);

        b = a.toLowerCase();
        System.out.print("lower: ");
        System.out.println(a == b);
    }

    private static void outrosWrappers() {
        byte a = 1;
        Byte bObj = new Byte(a);//DEPRECADO

        int b = 150;
        Integer iObj = new Integer(b);//DEPRECADO

        float c = 37.5F;
        Float fObj = new Float(c);//DEPRECADO

        double d = 230.1;
        Double dObj = new Double(d);//DEPRECADO

        char e='a';
        Character cObj=e;

        System.out.println("Byte bObj:  " + bObj);
        System.out.println("Integer iObj:  " + iObj);
        System.out.println("Float fObj:  " + fObj);
        System.out.println("Double dObj:  " + dObj);
        System.out.println("Character cObj:  " + cObj);

        byte bv = bObj;
        int iv = iObj;
        float fv = fObj;
        double dv = dObj;
        char cv = cObj;

        System.out.println("byte bv: " + bv);
        System.out.println("int iv: " + iv);
        System.out.println("float fv: " + fv);
        System.out.println("double dv: " + dv);
        System.out.println("char cv: " + cv);
    }

    private static void arrayListCharacter() {

        // Autoboxing pois o lista só trabalha com Classes
        ArrayList<Character> lista = new ArrayList<Character>();
        lista.add((char) 65);
        lista.add('A');
        lista.add(new Character('a'));//Deprecated
        lista.add(Character.valueOf('a'));

        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
            //Unboxing...
            char c = lista.get(i);
            System.out.println((int)c);
        }
    }

    //Qual deles vai imprimir true e qual vai imprimir false?
    private static void autoBoxingAndUnboxing() {

        //Criando wrapper
        Integer integer1 = new Integer(100);//Deprecated
        Integer integer2 = 100;
        Integer integer3 = 100;

        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);

        System.out.println((int)integer1 == integer2);
        System.out.println(integer2 == integer3);
        System.out.println(integer3 == integer3);
        System.out.println(integer1.equals(integer2));

        System.out.println("Parte 2: ");
        //Convertendo wrapper em primitivo
        int num1 = integer1.intValue();
        int num2 = integer2;
        int num3 = (int) integer3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println(num1 == num2);
        System.out.println(num1 == integer1);
        System.out.println(num3 == integer2);
        System.out.println(100 == integer2);
    }
}
