package pl.camp.it.listy2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        cos1(lista);
        cos2(lista);
        cos3(lista);

        List<String> lista2 = cos4(lista);

        System.out.println(Integer.MAX_VALUE);

        List<Integer> mojalistaIntow = new ArrayList<>();

        mojalistaIntow.add(5);

        Integer a = 3;
        Integer b = 5;
        int c = 6;

        int d = new Integer(5);

        Integer e = 6;

        System.out.println(a+c);

        Integer.parseInt("5");

    }

    public static void cos1(List<String> lista) {
        //cos robi z listą
    }

    public static void cos2(List<String> lista) {
        //cos robi z listą
    }

    public static void cos3(List<String> lista) {
        //cos robi z listą
    }

    public static List<String> cos4(List<String> lista) {
        //cos robi z listą
        return new ArrayList<>();
    }
}
