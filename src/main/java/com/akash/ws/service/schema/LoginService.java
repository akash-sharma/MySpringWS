
package com.akash.ws.service.schema;

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
@WebService(name = "LoginService", targetNamespace = "http://reqres.data.ws.akash.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoginService {


    /**
     * 
     * @param userDetailsRequest
     * @return
     *     returns com.akash.ws.service.schema.UserDetailsResponse
     */
    @WebMethod(operationName = "UserDetails")
    @WebResult(name = "UserDetailsResponse", targetNamespace = "http://reqres.data.ws.akash.com", partName = "UserDetailsResponse")
    public UserDetailsResponse userDetails(
        @WebParam(name = "UserDetailsRequest", targetNamespace = "http://reqres.data.ws.akash.com", partName = "UserDetailsRequest")
        UserDetailsRequest userDetailsRequest);

}
