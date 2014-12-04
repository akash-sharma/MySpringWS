package com.akash.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.akash.ws.server.employee.stub.EmployeeSalRequest;
import com.akash.ws.server.employee.stub.EmployeeSalResponse;

@Endpoint
public class EmployeeEndpoint {

//	http://stackoverflow.com/questions/14382565/springs-payloadvalidatinginterceptor-evaluates-xml-uncorrect-invalid
	
	public static final String NAMESPACE_URI="http://data.ws.akash.com/schema/employee";
	
	@PayloadRoot(localPart="EmployeeSalRequest" , namespace=NAMESPACE_URI)
	public @ResponsePayload EmployeeSalResponse anyRandomName(@RequestPayload EmployeeSalRequest esReq) throws Exception {
		
		EmployeeSalResponse esRes=new EmployeeSalResponse();
		esRes.setEmployeeSalary("200");
		return esRes;
	}
}