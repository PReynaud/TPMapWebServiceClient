/**
 * PaysWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PaysSoap;

public interface PaysWebService_PortType extends java.rmi.Remote {
    public java.lang.String sayHelloWorldFrom(java.lang.String from) throws java.rmi.RemoteException;
    public java.lang.Object[] obtainListePays() throws java.rmi.RemoteException;
}