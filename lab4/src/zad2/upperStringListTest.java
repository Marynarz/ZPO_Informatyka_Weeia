package zad2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class upperStringListTest {

	public List<String> lista = new ArrayList<String>()
				{{
					add("raz");
					add("dwA");
					add("tRZy");
					add("CZTERY");
					add("PIEC");
				}};
	public List<String> listaExc = new ArrayList<String>()
				{{
					add("RAZ");
					add("DWA");
					add("TRZY");
					add("CZTERY");
					add("PIEC");
				}};


	@Test
	public void testIndListUp() {
		upperStringList nowaLista = new upperStringList(this.lista);
		Assert.assertEquals(this.listaExc, nowaLista.indListUp());
	}

	@Test
	public void testRepAllStr() {
		upperStringList nowaLista = new upperStringList(this.lista);
		Assert.assertEquals(this.listaExc, nowaLista.repAllStr());
	}

	@Test
	public void testItMetStr() {
		upperStringList nowaLista = new upperStringList(this.lista);
		Assert.assertEquals(this.listaExc, nowaLista.itMetStr());
	}

}
