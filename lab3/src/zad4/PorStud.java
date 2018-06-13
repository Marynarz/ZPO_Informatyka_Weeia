package zad4;

import java.util.Comparator;

public class PorStud implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        if(s1.rok >s1.rok) return 1;
        else if(s1.rok<s1.rok) return -1;
        else{
            if(s1.nazwisko.substring(0,1).compareTo(s2.nazwisko.substring(0,1)) <0) return 1;
            else if(s1.nazwisko.substring(0,1).compareTo(s2.nazwisko.substring(0,1)) >0) return -1;
            else{
                if(s1.wzrost > s2.wzrost) return 1;
                else if(s1.wzrost<s2.wzrost) return -1;
                else return 0;
            }
        }
    }
}
