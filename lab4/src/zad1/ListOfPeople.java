package zad1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class ListOfPeople {
	File pliczek;
	URL url;
	Reader odczytPliku;
	BufferedReader fIn;
	
	public ListOfPeople() throws IOException{
		url = new URL("http://szgrabowski.kis.p.lodz.pl/zpo17/dane.txt");
		//pliczek = new File("./ZPO_Informatyka_Weeia/lab4/src/zad1/dane.txt");
		odczytPliku = new InputStreamReader(url.openStream(),"ISO-8859-2");
		fIn = new BufferedReader(odczytPliku);
		while(fIn.readLine()!=null){
			System.out.println(fIn.readLine());
		}
		odczytPliku.close();
			
	}
}
