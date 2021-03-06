
package com.akash.ws.client.stub.employee;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "EmployeeWsdlServicePortService", targetNamespace = "http://data.ws.akash.com/schema/employee", wsdlLocation = "file:/E:/LALA/oodles/new_projects/MySpringWS/src/main/webapp/wsdl/EmployeeWsdlService.wsdl")
public class EmployeeWsdlServicePortService
    extends Service
{

    private final static URL EMPLOYEEWSDLSERVICEPORTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.akash.ws.client.stub.employee.EmployeeWsdlServicePortService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.akash.ws.client.stub.employee.EmployeeWsdlServicePortService.class.getResource(".");
            url = new URL(baseUrl, "file:/E:/LALA/oodles/new_projects/MySpringWS/src/main/webapp/wsdl/EmployeeWsdlService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/E:/LALA/oodles/new_projects/MySpringWS/src/main/webapp/wsdl/EmployeeWsdlService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMPLOYEEWSDLSERVICEPORTSERVICE_WSDL_LOCATION = url;
    }

    public EmployeeWsdlServicePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeWsdlServicePortService() {
        super(EMPLOYEEWSDLSERVICEPORTSERVICE_WSDL_LOCATION, new QName("http://data.ws.akash.com/schema/employee", "EmployeeWsdlServicePortService"));
    }

    /**
     * 
     * @return
     *     returns EmployeeWsdlServicePort
     */
    @WebEndpoint(name = "EmployeeWsdlServicePortSoap11")
    public EmployeeWsdlServicePort getEmployeeWsdlServicePortSoap11() {
        return super.getPort(new QName("http://data.ws.akash.com/schema/employee", "EmployeeWsdlServicePortSoap11"), EmployeeWsdlServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeWsdlServicePort
     */
    @WebEndpoint(name = "EmployeeWsdlServicePortSoap11")
    public EmployeeWsdlServicePort getEmployeeWsdlServicePortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://data.ws.akash.com/schema/employee", "EmployeeWsdlServicePortSoap11"), EmployeeWsdlServicePort.class, features);
    }

}
