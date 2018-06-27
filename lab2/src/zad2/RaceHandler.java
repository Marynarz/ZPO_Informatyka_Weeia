package zad2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RaceHandler {
    private PriorityQueue<Cyclist> pQue;
    private Cyclist c1;
    public RaceHandler(){
        this.pQue = new PriorityQueue<Cyclist>(10,new Cyclist());
    }
    public void addToQue(Cyclist c){
        this.pQue.add(c);
    }
    public void printFirstThree(){
        int count =0;
        while(!pQue.isEmpty() && count<3){
            this.c1 = pQue.poll();
            System.out.println("BIB: "+ this.c1.bib +" Nazwisko: "+this.c1.nazwisko);
            this.c1 = null;
            ++count;
        }
        this.pQue.clear();
    }
}
