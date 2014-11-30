
package com.akash.ws.service.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userSalary" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="userGender" type="{http://data.ws.akash.com}UserGender"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetails", namespace = "http://data.ws.akash.com", propOrder = {
    "userId",
    "username",
    "age",
    "emailId",
    "userSalary",
    "userGender"
})
public class UserDetails {

    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String username;
    protected int age;
    @XmlElement(required = true)
    protected String emailId;
    protected double userSalary;
    @XmlElement(required = true)
    protected UserGender userGender;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the userSalary property.
     * 
     */
    public double getUserSalary() {
        return userSalary;
    }

    /**
     * Sets the value of the userSalary property.
     * 
     */
    public void setUserSalary(double value) {
        this.userSalary = value;
    }

    /**
     * Gets the value of the userGender property.
     * 
     * @return
     *     possible object is
     *     {@link UserGender }
     *     
     */
    public UserGender getUserGender() {
        return userGender;
    }

    /**
     * Sets the value of the userGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGender }
     *     
     */
    public void setUserGender(UserGender value) {
        this.userGender = value;
    }

}
