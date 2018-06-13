package zad4;

import java.util.ArrayList;
import java.util.List;

public class zad4 {
    public void main(String [] args){
        List<Student> studenty = new ArrayList<Student>(){{
           add(new Student("Wojciech","Niedzielski",1992,194));
           add(new Student("Woj","Niedzielski",1999,178));
           add(new Student("Woj","Kowalski",1992,210));
           add(new Student("jacke","Kowalczyk",1990,194));
           add(new Student("sdec","Cos",1985,195));
           add(new Student("Wojciech","Answd",2000,150));
           add(new Student("Wojciech","Niedzielski",1992,194));
        }};
        System.out.println(studenty);
        PorStud komp = new PorStud();
        studenty.sort(komp);
        System.out.println(studenty);

    }
}
