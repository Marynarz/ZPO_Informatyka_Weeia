package zad2;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class gamePlay {
    private testGen [] questions = new testGen[10];
    private answGen [] answers = new answGen[5];
    private List<Integer>numberQ = new ArrayList<Integer>();

    public gamePlay(){
        for(int i=0; i<10;i++) {
            this.questions[i] = new testGen();
            if(i%2==0) this.answers[i/2] = new answGen();
        }
        try {
            Gson gson = new Gson();
            Reader pliczek = new FileReader("PolEndTest.json");
            this.questions = gson.fromJson(pliczek, testGen[].class);
            //System.out.println(this.questions[9].answ);
            pliczek.close();
        }catch(Exception e){
            System.out.println(e);
        }
        this.randQues();
        //System.out.println(this.numberQ);
    }
    private void randQues(){
        Random generator = new Random();
        while(this.numberQ.size()<5){
            int wynik = generator.nextInt(10)+1;
            if(!this.numberQ.contains(wynik)) this.numberQ.add(wynik);
        }
    }
    public void startGame(){
        for(int i=0; i<5;i++){
            this.getQues(this.numberQ.get(i),i);
        }
        System.out.println("Bye...");

    }
    private void getQues(Integer numb, Integer ansNumb){
        String answ;
        Scanner odczyt = new Scanner();
        System.out.println("Pytanie: "+this.questions[numb].quest+"\nOdp: ");
        answ = odczyt.nextLine().toLowerCase();
        this.answers[ansNumb].no = ansNumb;
        this.answers[ansNumb].quest = this.questions[numb].quest;
        this.answers[ansNumb].answ = this.questions[numb].answ;
        this.answers[ansNumb].answered =  answ;
        this.answers[ansNumb].isOk = this.answers[ansNumb].answ.contains(answ);
        odczyt.close();
    }
}
