package zad2;

import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cyclist implements Runnable, Comparator<Cyclist> {
    private static final Logger logger = Logger.getLogger(Thread.currentThread().getStackTrace()[0].getClassName());
    public String imie;
    public String nazwisko;
    public Integer bib;
    public double velo;
    public double distance;
    private double distanceMax;
    private Thread th;
    private RaceHandler rH;

    public Cyclist(){
        this.logger.log(Level.FINE,"Empty constuctor");
        this.imie = " ";
        this.nazwisko = " ";
        this.velo = 0;
        this.bib = 0;
        this.distance = 0;
        this.distanceMax = 0;
        this.rH = null;
    }
    public Cyclist(Integer bib, String imie, String nazwisko, double velo, double distanceM, RaceHandler rh){
        this.logger.log(Level.FINE,"Normal constructor, name: "+imie+" surname: "+nazwisko);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.velo = velo * (1/3.6);
        this.bib = bib;
        this.distance = 0;
        this.distanceMax = distanceM * 1000;
        this.rH = rh;
    }
    public void run(){
            try {
                while (this.distance <= this.distanceMax) {
                    synchronized (this){
                        this.distance += this.velo * 25;
                        //System.out.println(this.bib+" "+this.imie+" "+this.nazwisko+": dystans przebyty: "+this.distance/1000);
                        this.rH.addToQue(this);
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
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
        if(c1 == null || c2 ==null){
            return 0;
        }
        return (int) c2.distance - (int) c1.distance;
    }
}
