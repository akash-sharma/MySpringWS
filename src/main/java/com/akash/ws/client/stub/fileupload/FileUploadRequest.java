
package com.akash.ws.client.stub.fileupload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileContent" type="{http://data.ws.akash.com/schema/fileupload}fileContent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileContent"
})
@XmlRootElement(name = "FileUploadRequest")
public class FileUploadRequest {

    @XmlElement(required = true)
    protected FileContent fileContent;

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link FileContent }
     *     
     */
    public FileContent getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileContent }
     *     
     */
    public void setFileContent(FileContent value) {
        this.fileContent = value;
    }

}
