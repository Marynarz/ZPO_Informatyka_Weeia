package zad3;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class zad3 {
    public static void main(String [] args){
        Map<String,Integer>counts = new HashMap<String,Integer>();
        counts.put("words",1);
        System.out.println(counts);
        counts.merge("words",1,Integer::sum);
        System.out.println(counts);
    }
}
