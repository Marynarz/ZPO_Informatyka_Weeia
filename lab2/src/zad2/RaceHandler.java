package zad2;

import java.util.PriorityQueue;

public class RaceHandler {
    private PriorityQueue<Cyclist> pQue;
    public RaceHandler(){
        this.pQue = new PriorityQueue<Cyclist>();
    }
    public void addToQue(Cyclist c){
        this.pQue.add(c);
    }
}
