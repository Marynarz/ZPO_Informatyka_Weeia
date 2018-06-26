package zad1;
import java.util.Arrays;
import java.util.SortedSet;

public class zad1 {
	public static double LevQWERTY(String s1, String s2){
		char [] c1 = s1.toLowerCase().toCharArray();
		char [] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1 == c2){
            return 0.0;
        }


        return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LevQWERTY("drab","dal"));

	}

}
