package fr.epsi.example;

import org.junit.Test;

public class BidonTest {

	@Test(expected=IllegalArgumentException.class)
	public void returnExceptionTest()  {
		Bidon bidon = new Bidon();
		bidon.returnException();
	}
}
