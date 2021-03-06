
package com.akash.ws.client.stub.fileupload;

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
@WebService(name = "FileUploadWsdlServicePort", targetNamespace = "http://data.ws.akash.com/schema/fileupload")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FileUploadWsdlServicePort {


    /**
     * 
     * @param fileUploadRequest
     * @return
     *     returns com.akash.ws.client.stub.fileupload.FileUploadResponse
     */
    @WebMethod(operationName = "FileUpload")
    @WebResult(name = "FileUploadResponse", targetNamespace = "http://data.ws.akash.com/schema/fileupload", partName = "FileUploadResponse")
    public FileUploadResponse fileUpload(
        @WebParam(name = "FileUploadRequest", targetNamespace = "http://data.ws.akash.com/schema/fileupload", partName = "FileUploadRequest")
        FileUploadRequest fileUploadRequest);

}
