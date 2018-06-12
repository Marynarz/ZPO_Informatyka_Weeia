package zad4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zad4 {
    public static void main(String [] args){
        List<String>lista1 = new ArrayList<String>()
        {{
            add("Raz");
            add("dwa");
            add("trzu");
            add("CZTERY");
        }};

        zad4.swap(lista1,0,3);

        List<Integer>lista2 = new LinkedList<Integer>()
        {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        zad4.swap(lista2,2,1);

        System.out.println(lista1);
        System.out.println(lista2);

    }
    public static <T>void swap(List<T> list, int i, int j){
        T t1 = list.get(i);
        T t2 = list.get(j);
        list.set(j,t1);
        list.set(i,t2);
    }
}
