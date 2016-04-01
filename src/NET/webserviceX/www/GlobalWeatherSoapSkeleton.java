/**
 * GlobalWeatherSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class GlobalWeatherSoapSkeleton implements NET.webserviceX.www.GlobalWeatherSoap, org.apache.axis.wsdl.Skeleton {
    private NET.webserviceX.www.GlobalWeatherSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.webserviceX.NET", "CityName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.webserviceX.NET", "CountryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getWeather", _params, new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetWeatherResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetWeather"));
        _oper.setSoapAction("http://www.webserviceX.NET/GetWeather");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getWeather") == null) {
            _myOperations.put("getWeather", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getWeather")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.webserviceX.NET", "CountryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCitiesByCountry", _params, new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetCitiesByCountryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.webserviceX.NET", "GetCitiesByCountry"));
        _oper.setSoapAction("http://www.webserviceX.NET/GetCitiesByCountry");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCitiesByCountry") == null) {
            _myOperations.put("getCitiesByCountry", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCitiesByCountry")).add(_oper);
    }

    public GlobalWeatherSoapSkeleton() {
        this.impl = new NET.webserviceX.www.GlobalWeatherSoapImpl();
    }

    public GlobalWeatherSoapSkeleton(NET.webserviceX.www.GlobalWeatherSoap impl) {
        this.impl = impl;
    }
    public java.lang.String getWeather(java.lang.String cityName, java.lang.String countryName) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getWeather(cityName, countryName);
        return ret;
    }

    public java.lang.String getCitiesByCountry(java.lang.String countryName) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getCitiesByCountry(countryName);
        return ret;
    }

}
