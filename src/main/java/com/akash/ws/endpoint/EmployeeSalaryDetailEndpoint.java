package com.akash.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.akash.ws.data.emp.employee.EmployeeSalRequest;
import com.akash.ws.data.emp.employee.EmployeeSalResponse;

@Endpoint
public class EmployeeSalaryDetailEndpoint {

	public static final String NAMESPACE_URI="http://emp.data.ws.akash.com/employee";
	
	@PayloadRoot(localPart="EmployeeSalRequest" , namespace=NAMESPACE_URI)
	public @ResponsePayload EmployeeSalResponse anyRandomName(@RequestPayload EmployeeSalRequest esReq) {
		EmployeeSalResponse esRes=new EmployeeSalResponse();
		esRes.setEmployeeSalary("200");
		return esRes;
	}
}