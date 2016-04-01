package com.nirakar.weather.application;

import java.io.StringReader;
import java.rmi.RemoteException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.rpc.ServiceException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import NET.webserviceX.www.GlobalWeatherLocator;
import NET.webserviceX.www.GlobalWeatherSoap;

public class TestWeather {

	public static void main(String[] args) {

		GlobalWeatherLocator globalWeatherLocatorObject = new GlobalWeatherLocator();
		GlobalWeatherSoap globalWeatherSoapStub = null;
		String citiesList = "";
		try {
			globalWeatherSoapStub = globalWeatherLocatorObject
					.getGlobalWeatherSoap();
			citiesList = globalWeatherSoapStub
					.getCitiesByCountry("United States");
		} catch (ServiceException e) {

			e.printStackTrace();
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		 System.out.println(citiesList);
		 //convertStringToDocument(citiesList);
		//Gson gson = new Gson();

		// convert java object to JSON format
		//String json = gson.toJson(citiesList);

		//System.out.println(json);

	}

	private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        StringBuffer xmlStr1 =new StringBuffer("<?xml version=" + "\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"); 
        xmlStr1.append(xmlStr);
        System.out.println(xmlStr1.toString());
        try  
        {  
            builder = factory.newDocumentBuilder();  
            Document doc = builder.parse( new InputSource( new StringReader( xmlStr1.toString() ) ) ); 
            
            NodeList nodeList = doc.getElementsByTagName("*");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                //System.out.println(node.getChildNodes());
               // if (node.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("--START--");
                    System.out.println(node.getFirstChild());
                    System.out.println("Country Name=="+node.getNodeName());
                    if(node.getNodeName().equalsIgnoreCase("Table"))
                    {
                    	
                    }
                    System.out.println("--END--");
                //}
            }
            return doc;
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        return null;
    }
	
}
