package zad2;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>listaStr = new ArrayList<String>()
				{{
					add("raz");
					add("dwA");
					add("tRZY");
					add("CoSTaM");
				}};
		upperStringList owaLista = new upperStringList(listaStr);
		System.out.println(owaLista.getStringList());
		owaLista.itMetStr();
		System.out.println(owaLista.getStringList());
	}

}
