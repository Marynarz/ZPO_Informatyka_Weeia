package zad1;

import java.util.Arrays;

public class SortowanieTekstu {
	private String[] words;
	private enum alphabet{
		a,ą,b,c,ć,d,e,ę,f,g,h,i,j,k,l,ł,m,n,ń,o,ó,p,r,s,ś,t,u,w,x,y,z,ź,ż
	}
	public SortowanieTekstu(String wyrazenie){
		this.setWords(wyrazenie);
		this.SortString();
	}
	public String getWords(){
		return String.join(" ", this.words);
	}
	public void setWords(String wyrazenie){
		this.words = wyrazenie.toLowerCase().split(" ");
	}
	private void SortString(){
		Arrays.sort(this.words);
	}
	
}
