package zad2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class zad2 {
    public static void main(String [] args){
        List<Cyclist>kolarze = new LinkedList<Cyclist>();
        String str;
        try{
            BufferedReader pliczek = new BufferedReader(new FileReader("kolarze.txt"));
            int i=1;
            while((str = pliczek.readLine())!=null){
                String [] temp = str.split(" "); //imie[0],nazwisko[1],predkosc[2]
                kolarze.add(new Cyclist(i,temp[0],temp[1],Float.parseFloat(temp[2])));
                ++i;
            }

        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }



    }
}
