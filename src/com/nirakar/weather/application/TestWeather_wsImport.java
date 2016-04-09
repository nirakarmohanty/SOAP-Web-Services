package com.nirakar.weather.application;

import com.nirakar.wsimport.command.prmt.GlobalWeather;
import com.nirakar.wsimport.command.prmt.GlobalWeatherSoap;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

//import com.nirakar.wsimport.command.prmt.GlobalWeather;

public class TestWeather_wsImport {
	
	public static void main(String args[]){
		
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap=globalWeather.getGlobalWeatherSoap();
        System.out.println(globalWeatherSoap.getCitiesByCountry("United States"));

	}

}
