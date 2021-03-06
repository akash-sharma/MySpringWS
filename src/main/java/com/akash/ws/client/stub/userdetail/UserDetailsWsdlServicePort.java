
package com.akash.ws.client.stub.userdetail;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "UserDetailsWsdlServicePort", targetNamespace = "http://data.ws.akash.com/schema/userdetails")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserDetailsWsdlServicePort {


    /**
     * 
     * @param userDetailsRequest
     * @return
     *     returns com.akash.ws.client.stub.userdetail.UserDetailsResponse
     */
    @WebMethod(operationName = "UserDetails")
    @WebResult(name = "UserDetailsResponse", targetNamespace = "http://data.ws.akash.com/schema/userdetails", partName = "UserDetailsResponse")
    public UserDetailsResponse userDetails(
        @WebParam(name = "UserDetailsRequest", targetNamespace = "http://data.ws.akash.com/schema/userdetails", partName = "UserDetailsRequest")
        UserDetailsRequest userDetailsRequest);

}
