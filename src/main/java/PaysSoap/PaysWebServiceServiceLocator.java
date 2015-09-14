/**
 * PaysWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PaysSoap;

public class PaysWebServiceServiceLocator extends org.apache.axis.client.Service implements PaysSoap.PaysWebServiceService {

    public PaysWebServiceServiceLocator() {
    }


    public PaysWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaysWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PaysWebService
    private java.lang.String PaysWebService_address = "http://localhost:8080/services/PaysWebService";

    public java.lang.String getPaysWebServiceAddress() {
        return PaysWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaysWebServiceWSDDServiceName = "PaysWebService";

    public java.lang.String getPaysWebServiceWSDDServiceName() {
        return PaysWebServiceWSDDServiceName;
    }

    public void setPaysWebServiceWSDDServiceName(java.lang.String name) {
        PaysWebServiceWSDDServiceName = name;
    }

    public PaysSoap.PaysWebService_PortType getPaysWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PaysWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPaysWebService(endpoint);
    }

    public PaysSoap.PaysWebService_PortType getPaysWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PaysSoap.PaysWebServiceSoapBindingStub _stub = new PaysSoap.PaysWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPaysWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaysWebServiceEndpointAddress(java.lang.String address) {
        PaysWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PaysSoap.PaysWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                PaysSoap.PaysWebServiceSoapBindingStub _stub = new PaysSoap.PaysWebServiceSoapBindingStub(new java.net.URL(PaysWebService_address), this);
                _stub.setPortName(getPaysWebServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PaysWebService".equals(inputPortName)) {
            return getPaysWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws", "PaysWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws", "PaysWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PaysWebService".equals(portName)) {
            setPaysWebServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
