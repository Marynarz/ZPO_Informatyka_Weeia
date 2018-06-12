package zad1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.*;

public class ListOfPeople {
	//File pliczek;
	URL url;
	Reader odczytPliku;
	BufferedReader fIn;
	List<String> bufferedFile;
	
	public ListOfPeople() throws IOException{
		this.bufferedFile = new ArrayList<String>();
		url = new URL("http://szgrabowski.kis.p.lodz.pl/zpo17/dane.txt");
		//pliczek = new File("./ZPO_Informatyka_Weeia/lab4/src/zad1/dane.txt");
		odczytPliku = new InputStreamReader(url.openStream(),"ISO-8859-2");
		fIn = new BufferedReader(odczytPliku);
		String str = "";
		while((str=fIn.readLine())!=null){
			this.bufferedFile.add(str);
		}
		System.out.println(this.bufferedFile);
		odczytPliku.close();
	}
	private List<Integer>getCountry(String countryCode){
		List<Integer>sumList = new ArrayList<>();
		ListIterator<String> it1 = this.bufferedFile.listIterator();

		while(it1.hasNext()){
			String [] roboczy = it1.next().split(" ");
			if(roboczy[2].equals(countryCode)){
				System.out.println(roboczy[2]);
				sumList.add(Integer.parseInt(roboczy[3]));
			}
		}
		return sumList;
	}
	public String getResult(String countryCode){
		countryCode = countryCode.toUpperCase();
		List<Integer>tmpList = this.getCountry(countryCode);
		Collections.sort(tmpList);
		Integer minSal = tmpList.get(0) + tmpList.get(1);
		Integer maxSal = tmpList.get(tmpList.size()-1) + tmpList.get(tmpList.size()-2);
		return "Min: "+ Integer.toString(minSal) + "; Max: "+ Integer.toString(maxSal);
	}
}
