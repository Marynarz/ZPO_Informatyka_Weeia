package zad1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ListOfPeople pierwszy = new ListOfPeople();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
