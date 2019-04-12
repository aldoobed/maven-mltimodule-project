package org.sonatype.mavenbook.weather;

import java.io.InputStream;

public class WeatherService {
	
	private YahooRetriever yahooRetriever;
	private YahooParser yahooParser;

	public WeatherService() {
	}

	public Weather retrieveForecast(String woid) throws Exception {
		// Retrieve Data
		InputStream dataIn = yahooRetriever.retrieve(woid);
		// Parse Data
		Weather weather = yahooParser.parse(dataIn);
		
		return weather;

	}

	public YahooRetriever getYahooRetriever() {
		return yahooRetriever;
	}

	public void setYahooRetriever(YahooRetriever yahooRetriever) {
		this.yahooRetriever = yahooRetriever;
	}

	public YahooParser getYahooParser() {
		return yahooParser;
	}

	public void setYahooParser(YahooParser yahooParser) {
		this.yahooParser = yahooParser;
	}
}