package com.akash.ws.endpoint;

import java.io.FileOutputStream;

import javax.activation.DataHandler;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.akash.ws.client.stub.fileupload.FileContent;
import com.akash.ws.client.stub.fileupload.FileUploadRequest;
import com.akash.ws.client.stub.fileupload.FileUploadResponse;

@Endpoint
public class FileUploadEndpoint {

public static final String NAMESPACE_URI="http://data.ws.akash.com/schema/fileupload";
	
	@PayloadRoot(localPart="FileUploadRequest" , namespace=NAMESPACE_URI)
	public @ResponsePayload FileUploadResponse anyRandomName(@RequestPayload FileUploadRequest fuReq) throws Exception {
		
		FileOutputStream fileOuputStream = new FileOutputStream("E:\\testing_ws.txt");
		FileContent fileContent=fuReq.getFileContent();
		DataHandler dataHandler = fileContent.getFile();
		dataHandler.writeTo(fileOuputStream);
	    fileOuputStream.close();
		
		FileUploadResponse fuRes=new FileUploadResponse();
		fuRes.setUploadStatus("success");
		return fuRes;
	}
}
