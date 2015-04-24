package fr.epsi.sample;

import org.junit.Assert;
import org.junit.Test;

import fr.epsi.sample.YahooRetriever;

public class YahooRetrieverTest {

	@Test
	public void retrieve() throws Exception {
		YahooRetriever yahooRetriever = new YahooRetriever();
		Assert.assertNotNull(yahooRetriever.retrieve("613858"));
	}
}
