package zad1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings({ "unused", "deprecation" })
public class zad1Test {

	@SuppressWarnings("deprecation")
	@Test
	public void testLevQWERTY() {
		Assert.assertEquals(0.0,zad1.LevQWERTY("pies","pies"));
		Assert.assertEquals(2.0,zad1.LevQWERTY("kot", "kotka"));
		
	}

}