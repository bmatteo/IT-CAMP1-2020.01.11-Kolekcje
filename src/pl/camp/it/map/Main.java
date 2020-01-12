package pl.camp.it.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Translation> mapa = new HashMap<>();
        //Map<String, Translation> mapaSpain = new HashMap<>();

        Translation pies = new Translation("dog", "asd",
                "asd", "28-11-2029");

        mapa.put(pies.english, pies);
        mapa.put(pies.france, pies);
        mapa.put(pies.spain, pies);


        //mapaSpain.put("asd", pies);

        System.out.println(mapa.get("pies"));

        Set<Map.Entry<String, Translation>> wszystkieWpisy = mapa.entrySet();

        System.out.println(wszystkieWpisy);

        Iterator<Map.Entry<String, Translation>> mojIterator =
                wszystkieWpisy.iterator();

        while (mojIterator.hasNext()) {
            Map.Entry<String, Translation> mojEntry = mojIterator.next();

            System.out.println("Klucz: " + mojEntry.getKey()
                    + " Wartość: " + mojEntry.getValue());
        }

        mapa.remove("dog");

        System.out.println(mapa);
    }
}
