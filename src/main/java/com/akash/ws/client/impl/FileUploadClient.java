package com.akash.ws.client.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;

import org.springframework.stereotype.Component;

import com.akash.ws.client.stub.fileupload.FileContent;
import com.akash.ws.client.stub.fileupload.FileUploadRequest;
import com.akash.ws.client.stub.fileupload.FileUploadWsdlServicePort;
import com.akash.ws.client.stub.fileupload.FileUploadWsdlServicePortService;

//	Imp=>
//
//	http://stackoverflow.com/questions/2830561/how-to-convert-an-inputstream-to-a-datahandler
//	http://mail-archives.apache.org/mod_mbox/axis-java-user/200303.mbox/%3C95032DB4AF7ED4118C6100508BF1D18CDCEECF@tormsg01.ad.infosys.com%3E

//	http://stackoverflow.com/questions/4671625/converting-datahandler-to-byte
	

@Component
public class FileUploadClient {

	public void uploadFile() throws FileNotFoundException {
		FileUploadWsdlServicePortService fuwsps=new FileUploadWsdlServicePortService();
		FileUploadWsdlServicePort fuwsp=fuwsps.getFileUploadWsdlServicePortSoap11();
		FileUploadRequest fileUploadRequest = new FileUploadRequest();
		FileContent fileContent=new FileContent();
		
		javax.activation.DataSource byteArrayDataSource=new ByteArrayDataSource();
		File file = new File("E:\\Abc1.txt");
		FileInputStream fin = new FileInputStream(file);
		
//		DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(inputStream))
		
//		
		fileContent.setFile(null);
		fileContent.setFileName("Abc1.txt");
		
		fileUploadRequest.setFileContent(fileContent);
		fuwsp.fileUpload(fileUploadRequest);
	}
	
	public class ByteArrayDataSource implements javax.activation.DataSource {
		private byte[] bytes;
		public void setBytes(byte[] bytes) { this.bytes = bytes; }
		public byte[] getBytes() { return bytes; }
		private String contentType;
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
		public String getContentType() { return contentType; }
		
		public InputStream getInputStream() {
			return new ByteArrayInputStream(bytes);
		}
		
		
		/** for completeness, here's how to implement the outputstream.
		this is unnecessary for what you're doing, you can just throw
		an UnsupportedOperationException. */
		public OutputStream getOutputStream() {
			/*final ByteArrayDataSource bads = this;
			final ByteArrayOutputStream baos =
				new ByteArrayOutputStream();
			// return an outputstream that sets my byte array
			// when it is closed.
			return new FilterOutputStream(baos) {
				public void close() throws IOException {
					baos.close();
					bads.setBytes(baos.toByteArray());
				}
			}*/
			throw new UnsupportedOperationException("unable to convert");
		}
		@Override
		public String getName() {
			return "ByteArrayDataSource";
		}
	}
}
