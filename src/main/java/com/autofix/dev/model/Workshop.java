package com.autofix.dev.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Workshop {

	private long workshopId;
	private String workshopName;
	private String ownerName;
	private long phone;
	private String email;
	private String websiteURL;
	private String bankAccountNumber;
	private String bankName;
	private String bankAddress;
	private String bankIfscCode;
	private PaymentMethod paymentMethod;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private String country;
	private float latitude;
	private float longitude;
	private String zipCode;
	private Date createdAt;
	private Date modifiedAt;
	private String deleteStatus;
	private Date deletedAt;
	
	public Workshop() {
		super();
	}

	/**
	 * @param workshopId
	 * @param workshopName
	 * @param ownerName
	 * @param phone
	 * @param email
	 * @param websiteURL
	 * @param bankAccountNumber
	 * @param bankName
	 * @param bankAddress
	 * @param bankIfscCode
	 * @param paymentMethod
	 * @param address1
	 * @param address2
	 * @param address3
	 * @param city
	 * @param state
	 * @param country
	 * @param latitude
	 * @param longitude
	 * @param zipCode
	 * @param createdAt
	 * @param modifiedAt
	 * @param deleteStatus
	 * @param deletedAt
	 */
	public Workshop(long workshopId, String workshopName, String ownerName,
			long phone, String email, String websiteURL,
			String bankAccountNumber, String bankName, String bankAddress,
			String bankIfscCode, PaymentMethod paymentMethod, String address1,
			String address2, String address3, String city, String state,
			String country, float latitude, float longitude, String zipCode,
			Date createdAt, Date modifiedAt, String deleteStatus, Date deletedAt) {
		super();
		this.workshopId = workshopId;
		this.workshopName = workshopName;
		this.ownerName = ownerName;
		this.phone = phone;
		this.email = email;
		this.websiteURL = websiteURL;
		this.bankAccountNumber = bankAccountNumber;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankIfscCode = bankIfscCode;
		this.paymentMethod = paymentMethod;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.zipCode = zipCode;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.deleteStatus = deleteStatus;
		this.deletedAt = deletedAt;
	}

	/**
	 * @return the workshopId
	 */
	public long getWorkshopId() {
		return workshopId;
	}

	/**
	 * @param workshopId the workshopId to set
	 */
	public void setWorkshopId(long workshopId) {
		this.workshopId = workshopId;
	}

	/**
	 * @return the workshopName
	 */
	public String getWorkshopName() {
		return workshopName;
	}

	/**
	 * @param workshopName the workshopName to set
	 */
	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the websiteURL
	 */
	public String getWebsiteURL() {
		return websiteURL;
	}

	/**
	 * @param websiteURL the websiteURL to set
	 */
	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

	/**
	 * @return the bankAccountNumber
	 */
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	/**
	 * @param bankAccountNumber the bankAccountNumber to set
	 */
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the bankAddress
	 */
	public String getBankAddress() {
		return bankAddress;
	}

	/**
	 * @param bankAddress the bankAddress to set
	 */
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	/**
	 * @return the bankIfscCode
	 */
	public String getBankIfscCode() {
		return bankIfscCode;
	}

	/**
	 * @param bankIfscCode the bankIfscCode to set
	 */
	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}

	/**
	 * @return the paymentMethod
	 */
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the latitude
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the modifiedAt
	 */
	public Date getModifiedAt() {
		return modifiedAt;
	}

	/**
	 * @param modifiedAt the modifiedAt to set
	 */
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	/**
	 * @return the deleteStatus
	 */
	public String getDeleteStatus() {
		return deleteStatus;
	}

	/**
	 * @param deleteStatus the deleteStatus to set
	 */
	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	/**
	 * @return the deletedAt
	 */
	public Date getDeletedAt() {
		return deletedAt;
	}

	/**
	 * @param deletedAt the deletedAt to set
	 */
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	
}
