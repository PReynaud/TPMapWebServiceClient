/**
 * PaysWebServiceServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package controller;


/**
 *  PaysWebServiceServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class PaysWebServiceServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public PaysWebServiceServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public PaysWebServiceServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for obtainListePays method
     * override this method for handling normal response from obtainListePays operation
     */
    public void receiveResultobtainListePays(
        controller.PaysWebServiceServiceStub.ObtainListePaysResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obtainListePays operation
     */
    public void receiveErrorobtainListePays(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for _1 method
     * override this method for handling normal response from _1 operation
     */
    public void receiveResult_1() {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from _1 operation
     */
    public void receiveError_1(java.lang.Exception e) {
    }
}
