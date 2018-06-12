package zad3;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class zad3 {
    public static void main(String [] args) throws NoSuchFieldException, NullPointerException {
        Map<String, Integer> counts = new HashMap<String, Integer>();
        counts.put("words", 1);
        System.out.println(counts);
        mapSwapper swaper = new mapSwapper(counts);
        swaper.contKSwp("words", 2);
        System.out.println(swaper.getMap());
        try {
            swaper.geNuSwp("cos", 1);

        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            swaper.geNuSwp("words", -1);
        }
        System.out.println(swaper.getMap());
        try {
            swaper.orDefSwp("cos", 1);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            swaper.orDefSwp("words", 7);
        }
        System.out.println(swaper.getMap());
        swaper.ifAbsSwp("cos", 4);
        swaper.ifAbsSwp("words", 10);
        System.out.println(swaper.getMap());
    }
}
