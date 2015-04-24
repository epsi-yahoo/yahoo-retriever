package fr.epsi.sample;

import org.junit.Assert;
import org.junit.Test;

import fr.epsi.sample.Weather;
import fr.epsi.sample.YahooParser;
import fr.epsi.sample.YahooRetriever;

public class YahooParserTest {

	@Test
	public void parse() throws Exception {
		YahooParser yahooParser = new YahooParser();
		
		YahooRetriever yahooRetriever = new YahooRetriever();
		Weather weather = yahooParser.parse(yahooRetriever.retrieve("613858"));
		
		Assert.assertNotNull(weather);
		Assert.assertEquals("Nantes", weather.getCity());
	}
}
