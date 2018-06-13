package zad3;

import com.google.common.base.Splitter;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class zad3 {

    public static void main(String [] args){
        try {
            System.out.println(zad3.cutter("Ala ma kota", 3));
            System.out.println(zad3.cutter("abcd", 2));
            System.out.println(zad3.cutter("Parostatkiem w piekny rejs, statkiem na pare, w piekny rejs...", 5));
            System.out.println(zad3.cutter(null, 3));
        } catch(IllegalArgumentException e){
            System.out.println("Error");
        }
        try {
            System.out.println(Splitter.fixedLength(3).split("Ala ma kota"));
            System.out.println(Splitter.fixedLength(2).split("abcd"));
            System.out.println(Splitter.fixedLength(5).split("Parostatkiem w piekny rejs, statkiem na pare, w piekny rejs..."));
            System.out.println(Splitter.fixedLength(3).split(null));
        } catch(NullPointerException e){
            System.out.println("Error");
        }
    }
    public static List<String> cutter(@NotNull String roboczy, Integer iDat) throws IllegalArgumentException{
        if(roboczy==null || iDat<=0) throw new IllegalArgumentException();
        List<String> wynik = new ArrayList<String>();
        Boolean czyOk = true;
        Integer first = 0;
        Integer data = iDat;

        while(czyOk){
            if(data <=roboczy.length()){
                wynik.add(roboczy.substring(first,data));
            } else if(first<roboczy.length()){
                wynik.add(roboczy.substring(first,roboczy.length()));
                czyOk = false;
            }  else{
                czyOk=false;
            }
            first = data++;
            data = first+iDat;
        }
        return wynik;
    }
}
