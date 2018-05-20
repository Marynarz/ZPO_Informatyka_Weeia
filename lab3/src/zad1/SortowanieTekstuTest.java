package zad1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SortowanieTekstuTest {

	@Test
	public void testGetWords() {
		SortowanieTekstu st = new SortowanieTekstu("Dupa chuj Ło ja pierdolę");
		Assert.assertEquals("Dupa chuj Ło ja pierdolę", st.getWords());
	}

}
