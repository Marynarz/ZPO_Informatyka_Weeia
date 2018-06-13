package zad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zad4 {
    public static void main(String [] args){
        List<Student> studenty = new ArrayList<Student>(){{
           add(new Student("W1","Niedzielski",1992,194));
           add(new Student("W2","Niedzielski",1999,178));
           add(new Student("W3","Kowalski",1992,210));
           add(new Student("W4","Kowalczyk",1990,194));
           add(new Student("W5","Cos",1985,195));
           add(new Student("W6","Answd",2000,150));
           add(new Student("W7","Niedzielski",1992,194));
        }};
        for(int i=0;i<studenty.size();i++) System.out.println(studenty.get(i).imie);
        //PorStud komp = new PorStud();
        System.out.println("---");
        Collections.sort(studenty);
        //studenty.sort(komp);
        for(int i=0;i<studenty.size();i++) System.out.println(studenty.get(i).imie);

    }
}
