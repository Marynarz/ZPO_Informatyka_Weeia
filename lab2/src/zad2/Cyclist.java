package zad2;

import java.util.Comparator;

public class Cyclist implements Runnable, Comparator<Cyclist> {
    public String imie;
    public String nazwisko;
    public Integer bib;
    public double velo;
    private double distance;
    private double distanceMax;
    private Thread th;
    private RaceHandler rH;

    public Cyclist(){
        this.imie = " ";
        this.nazwisko = " ";
        this.velo = 0;
        this.bib = 0;
        this.distance = 0;
        this.distanceMax = 0;
        this.rH = null;
    }
    public Cyclist(Integer bib, String imie, String nazwisko, double velo, double distanceM, RaceHandler rh){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.velo = velo * (1/3.6);
        this.bib = bib;
        this.distance = 0;
        this.distanceMax = distanceM * 1000;
        this.rH = rh;
    }
    public void run(){
        try{
            while(this.distance<=this.distanceMax){
                this.distance += this.velo*25;
                //System.out.println(this.bib+" "+this.imie+" "+this.nazwisko+": dystans przebyty: "+this.distance/1000);
                this.rH.addToQue(this);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.exit(0);
        }
    }
    public void start(){
        if(this.th == null){
            this.th = new Thread(this, this.imie+this.nazwisko);
            this.th.start();
        }
    }
    public int compare(Cyclist c1, Cyclist c2) {
        return (int) c1.distance - (int) c2.distance;
    }
}
