package zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class zad2 {
    public static void main(String [] args){
        Logger logger = Logger.getLogger(Thread.currentThread().getStackTrace()[0].getClassName());
        List<Cyclist>kolarze = new LinkedList<Cyclist>();
        RaceHandler rH = new RaceHandler();
        //System.out.println("init ok");
        String str;
        try{
            BufferedReader pliczek = new BufferedReader(new FileReader("/home/wojtek/ZPO_Informatyka_Weeia/lab2/kolarze.txt"));
            int i=1;
            while((str = pliczek.readLine())!=null){
                String [] temp = str.split(" "); //imie[0],nazwisko[1],predkosc[2]
                kolarze.add(new Cyclist(i,temp[0],temp[1],Double.parseDouble(temp[2]),10,rH));
                ++i;
            }
            pliczek.close();
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        for(int i=0;i<kolarze.size();i++){
            synchronized (rH){
                kolarze.get(i).start();
                rH.printFirstThree();
            }

            try{
                Thread.sleep(4000);
                //kolarze.get(i).join();
            }catch(InterruptedException e){
                System.exit(0);
            }

        }
        while(true){

            try{
                synchronized(rH){
                    rH.printFirstThree();
                    Thread.sleep(1000);
                }

                //kolarze.get(i).join();
            }catch(InterruptedException e){
                System.exit(0);
            }
        }

    }
}
