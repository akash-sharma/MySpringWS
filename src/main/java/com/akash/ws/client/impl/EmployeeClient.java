package com.akash.ws.client.impl;

import org.springframework.stereotype.Component;

import com.akash.ws.client.stub.employee.EmployeeSalRequest;
import com.akash.ws.client.stub.employee.EmployeeSalResponse;
import com.akash.ws.client.stub.employee.EmployeeWsdlServicePort;
import com.akash.ws.client.stub.employee.EmployeeWsdlServicePortService;

@Component
public class EmployeeClient {

	public EmployeeSalResponse callEndpoint() {
		EmployeeWsdlServicePortService ewsps = new EmployeeWsdlServicePortService(); 
		EmployeeWsdlServicePort ews = ewsps.getEmployeeWsdlServicePortSoap11();
		
		EmployeeSalRequest employeeSalRequest = new EmployeeSalRequest();
		employeeSalRequest.setEmployeeId(20);
		EmployeeSalResponse response = ews.employeeSal(employeeSalRequest);
		System.out.println("response ="+response.getEmployeeSalary());
		return response;
	}
}
