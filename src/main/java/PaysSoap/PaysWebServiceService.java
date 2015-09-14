/**
 * PaysWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PaysSoap;

public interface PaysWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getPaysWebServiceAddress();

    public PaysSoap.PaysWebService_PortType getPaysWebService() throws javax.xml.rpc.ServiceException;

    public PaysSoap.PaysWebService_PortType getPaysWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
