package zad2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.logging.Logger;

public class RaceHandler {
    private static final Logger logger = Logger.getLogger(Thread.currentThread().getStackTrace()[0].getClassName());
    private PriorityQueue<Cyclist> pQue;
    private Cyclist c1;
    private PriorityQueue<Cyclist> temp;

    public RaceHandler(){
        this.pQue = new PriorityQueue<Cyclist>(10,new Cyclist());
        this.temp = new PriorityQueue<Cyclist>(10,new Cyclist());
    }
    public void addToQue(Cyclist c){
        if(this.pQue.contains(c)){
            this.pQue.remove(c);
        }
        this.pQue.add(c);
    }
    public void printFirstThree(){
        int count =0;
        System.out.println("\n\n\n");
        while(!this.pQue.isEmpty() && count<3){
            try{
                this.temp.add(this.pQue.poll());
            }catch(NullPointerException e){
                break;
            }
            ++count;
        }
        while(!this.temp.isEmpty()){
            this.c1 = this.temp.poll();
            System.out.println("Position: "+count+" BIB: "+ this.c1.bib +" Nazwisko: "+this.c1.nazwisko+" distance: "+this.c1.distance);
            this.addToQue(this.c1);
        }


    }
}
