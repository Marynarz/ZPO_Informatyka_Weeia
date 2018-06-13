package zad2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class zad2 {
    public static void main(String [] args){
        /**
        testGen [] pytania = new testGen[10];
        List<String> pyt = new ArrayList<String>()
        {{
            add("krzyczec");    //0
            add("biec");        //1
            add("pies");        //2
            add("komputer");    //3
            add("przemieszczac");//4
            add("nosic");       //5
            add("kot");         //6
            add("jajko");       //7
            add("samolot");     //8
            add("imie");        //9
        }};

        for(int i=0; i<10; i++){
            pytania[i] = new testGen();
            pytania[i].no = i+1;
            pytania[i].quest = pyt.get(i);
        }

        List<String>[]odp = new ArrayList[10];
        odp[0] = new ArrayList<String>()
        {{
           add("scream");
           add("shout");
           add("cry");
        }};
        pytania[0].answ=odp[0];

        odp[1] = new ArrayList<String>();
        odp[1].add("run");
        pytania[1].answ = odp[1];

        odp[2] = new ArrayList<String>();
        odp[2].add("dog");
        pytania[2].answ = odp[2];

        odp[3] = new ArrayList<String>();
        odp[3].add("computer");
        pytania[3].answ = odp[3];

        odp[4] = new ArrayList<String>()
        {{
            add("shift");
            add("move");
            add("displace");
        }};
        pytania[4].answ = odp[4];

        odp[5] = new ArrayList<String>(){{
                add("wear");
                add("carry");
            }};
        pytania[5].answ = odp[5];

        odp[6] = new ArrayList<String>();
        odp[6].add("cat");
        pytania[6].answ = odp[6];

        odp[7] = new ArrayList<String>();
        odp[7].add("egg");
        pytania[7].answ = odp[7];

        odp[8] = new ArrayList<String>(){{
                add("airplane");
                add("aircraft");
            }};
        pytania[8].answ = odp[8];

        odp[9] = new ArrayList<String>();
        odp[9].add("name");
        pytania[9].answ = odp[9];

        try{
            Writer pliczek = new FileWriter("PolEndTest.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(pytania,pliczek);
            pliczek.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
        **/
        gamePlay gra1 = new gamePlay();
        gra1.startGame();

    }
}
