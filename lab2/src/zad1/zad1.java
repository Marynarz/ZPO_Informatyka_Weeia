package zad1;
import java.util.SortedSet;

public class zad1 {
	public static double LevQWERTY(String s1, String s2){
		int l1 = s1.length() + 1;
		int l2 = s2.length() + 1;
		char [] s1C = new char[l1];
		char [] s2C = new char[l2];
		s1C = s1.toCharArray();
		s2C = s2.toCharArray();
		
		/**
		 * Podstawowe sprawdzenia
		 * Czy s1 jest równe s2?
		 * Czy s1 zawiera się w s2, lub odwrotnie?
		 */
		if(s1==s2){
			return 0;
		}		
		else if(s1.contains(s2) || s2.contains(s1)){
			return Math.abs(l1-l2);
		}
		
		char [] line1 = new char[10];
		char [] line2 = new char[9];
		char [] line3 = new char[7];
		
		/**
		 * Wgryanie klawiatury
		 */
		String tempS = "qwertyuiop";
		line1 = tempS.toCharArray();
		tempS = "asdfghjkl";
		line2 = tempS.toCharArray();
		tempS = "zxcvbnm";
		line3 = tempS.toCharArray();
		
		double score = Math.abs(l1-l2);
		
		SortedSet roboczy = new SortedSet();
		
		
		
		return 0.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LevQWERTY("drab","dal"));

	}

}
