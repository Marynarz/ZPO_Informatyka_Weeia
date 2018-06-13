package zad4;

import com.google.common.collect.ComparisonChain;

public class Student implements Comparable<Student>{
    public String imie;
    public String nazwisko;
    public Integer rok;
    public Integer wzrost;

    public Student(String imie, String nazwisko, Integer rok, Integer wzrost){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok = rok;
        this.wzrost = wzrost;
    }
    public int compareTo(Student s2){
        return ComparisonChain.start().compare(this.rok,s2.rok).compare(this.nazwisko.substring(0,1),s2.nazwisko.substring(0,1)).compare(s2.wzrost,this.wzrost).result();
    }
}
