package fr.epsi.sample;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {

    private static Logger log = Logger.getLogger(YahooRetriever.class);

    public InputStream retrieve(String zipcode) throws Exception {
        String url = "http://weather.yahooapis.com/forecastrss?w=" + zipcode + "&u=c";
        URLConnection conn = new URL(url).openConnection();
        return conn.getInputStream();
    }
}
