package pl.camp.it.sety;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> zbior = new TreeSet<>();

        zbior.add("a");
        zbior.add("y");
        zbior.add("x");
        zbior.add("b");
        zbior.add("m");

        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1.equals(p2));

        zbior.add(new String("a"));

        System.out.println(zbior);

        Iterator<String> i = zbior.iterator();

        while (i.hasNext()) {
            String mojElementZeZbioru = i.next();
            System.out.println("Iterator: " + mojElementZeZbioru);
        }

    }
}
