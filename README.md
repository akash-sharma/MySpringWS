WSDL URLs :

http://localhost:8080/MySpringWS/endpoints/UserDetailsWsdlService.wsdl
http://localhost:8080/MySpringWS/endpoints/EmployeeWsdlService.wsdl


MySpringWS
==========
spring web service => http://briansjavablog.blogspot.in/2013/01/spring-web-services-tutorial.html

rules of xsd to wsdl => http://stackoverflow.com/questions/1155809/spring-ws-generates-wsdl-without-operations

http://stackoverflow.com/questions/14382565/springs-payloadvalidatinginterceptor-evaluates-xml-uncorrect-invalid

http://forum.spring.io/forum/spring-projects/integration/101572-intercept-soap-message-spring-integration-jaxb

========================

Steps to create Spring WS :

(1) Add a servlet mapping for org.springframework.ws.transport.http.MessageDispatcherServlet in web.xml file.

(2) Create a valid XSD file for web service.Keep in mind some conventions for Spring WS.For e.g: http://stackoverflow.com/questions/1155809/spring-ws-generates-wsdl-without-operations

(3) Now you have to create Stub classes for this XSD at server side. You can use JAXB plugin of eclipse to create stub classes. Right click on xsd file-> New -> other -> JAXB -> JAXB classes from schema

(4) Create an Endpoint class with a method recieving Request object. You can create a class annotated with @Endpoint. You have to create a service method in class which receives a Request object having @RequestPayload annotation and returns a Response object annotated with @ResponsePayload .

One web service can have more than one endpoints.

 If you are using camel, then you have to create a camel endpoint and a camel route. In the route you have to mention the processor id with its method name.

(5) Now we have to create a wsdl for our web service. Spring web service creates WSDL from xsd itself and also exposes it.

<sws:dynamic-wsdl > tag creates a wsdl from xsd file. Internally it uses DefaultWsdl11Definition class to create a wsdl.

The MessageDispatcherServlet will automatically detect any WsdlDefinition beans defined in it's Spring container.This will help to automatically expose the wsdl with some url.

As one wsdl can have multiple Request-Response objects , one xsd can also have multiple Request-Response objects.


(6) Upto point no (5) , we have completed the web service creation step , but to communicate with this web service we have to create a client. For this we can make our own client. You can also test your web service using soapUI.

Steps to create Spring web service client =>
 
(6.1) You have to create stub classes for Request-Response objects
(6.2) You have to create a client implementation

To create stub classes at client side you can use  org.codehaus.mojo:jaxws-maven-plugin .
This will create 
  Request object class
  Response object class
  Port interface
  PortService class
 
 
To create client implementation you just need to an object of PortService class which will provide an object Port. 
