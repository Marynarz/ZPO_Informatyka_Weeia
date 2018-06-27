package zad2;

public class Cyclist implements Runnable {
    public String imie;
    public String nazwisko;
    public Integer bib;
    public double velo;
    private double distance;
    private double distanceMax;
    private Thread th;

    public Cyclist(Integer bib, String imie, String nazwisko, double velo, double distanceM){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.velo = velo * (1/3.6);
        this.bib = bib;
        this.distance = 0;
        this.distanceMax = distanceM * 1000;
    }
    public void run(){
        try{
            while(this.distance<=this.distanceMax){
                this.distance += this.velo*25;
                System.out.println(this.bib+" "+this.imie+" "+this.nazwisko+": dystans przebyty: "+this.distance/1000);
                Thread.sleep(1);
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

}
