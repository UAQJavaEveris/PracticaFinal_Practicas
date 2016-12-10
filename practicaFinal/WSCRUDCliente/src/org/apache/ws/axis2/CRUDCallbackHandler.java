
/**
 * CRUDCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package org.apache.ws.axis2;

    /**
     *  CRUDCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CRUDCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CRUDCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CRUDCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for bajaSinBD method
            * override this method for handling normal response from bajaSinBD operation
            */
           public void receiveResultbajaSinBD(
                    org.apache.ws.axis2.CRUDStub.BajaSinBDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bajaSinBD operation
           */
            public void receiveErrorbajaSinBD(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultaSinBD method
            * override this method for handling normal response from consultaSinBD operation
            */
           public void receiveResultconsultaSinBD(
                    org.apache.ws.axis2.CRUDStub.ConsultaSinBDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultaSinBD operation
           */
            public void receiveErrorconsultaSinBD(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consulta method
            * override this method for handling normal response from consulta operation
            */
           public void receiveResultconsulta(
                    org.apache.ws.axis2.CRUDStub.ConsultaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consulta operation
           */
            public void receiveErrorconsulta(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for alta method
            * override this method for handling normal response from alta operation
            */
           public void receiveResultalta(
                    org.apache.ws.axis2.CRUDStub.AltaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from alta operation
           */
            public void receiveErroralta(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificacionSinBD method
            * override this method for handling normal response from modificacionSinBD operation
            */
           public void receiveResultmodificacionSinBD(
                    org.apache.ws.axis2.CRUDStub.ModificacionSinBDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificacionSinBD operation
           */
            public void receiveErrormodificacionSinBD(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for altaSinBD method
            * override this method for handling normal response from altaSinBD operation
            */
           public void receiveResultaltaSinBD(
                    org.apache.ws.axis2.CRUDStub.AltaSinBDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from altaSinBD operation
           */
            public void receiveErroraltaSinBD(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for baja method
            * override this method for handling normal response from baja operation
            */
           public void receiveResultbaja(
                    org.apache.ws.axis2.CRUDStub.BajaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from baja operation
           */
            public void receiveErrorbaja(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificacion method
            * override this method for handling normal response from modificacion operation
            */
           public void receiveResultmodificacion(
                    org.apache.ws.axis2.CRUDStub.ModificacionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificacion operation
           */
            public void receiveErrormodificacion(java.lang.Exception e) {
            }
                


    }
    