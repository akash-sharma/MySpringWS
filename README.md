WSDL URLs :

http://localhost:8080/MySpringWS/endpoints/loginmanager.wsdl
http://localhost:8080/MySpringWS/endpoints/empSal.wsdl


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

(4) Create an @Endpoint class with a method recieving @RequestPayload object.

(5) 

