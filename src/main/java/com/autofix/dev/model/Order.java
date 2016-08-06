package com.autofix.dev.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.autofix.dev.model.map.OrderedService;

@XmlRootElement
public final class Order {

	private long orderId;
	private User user;
	private Vehicle vehicle;
	private List<OrderedService> orderedServices;
	private float latitude;
	private float longitude;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private String country;
	private String addressType;
	private PaymentMethod paymentMethod;
	private Date orderedAt;
	private Date modifiedAt;
	private String deleteStatus;
	private Date deletedAt;
	
	public Order() {
		super();
	}

	/**
	 * @param orderId
	 * @param user
	 * @param vehicle
	 * @param orderedServices
	 * @param latitude
	 * @param longitude
	 * @param address1
	 * @param address2
	 * @param address3
	 * @param city
	 * @param state
	 * @param country
	 * @param addressType
	 * @param paymentMethod
	 * @param orderedAt
	 * @param modifiedAt
	 * @param deleteStatus
	 * @param deletedAt
	 */
	public Order(long orderId, User user, Vehicle vehicle,
			List<OrderedService> orderedServices, float latitude,
			float longitude, String address1, String address2, String address3,
			String city, String state, String country, String addressType,
			PaymentMethod paymentMethod, Date orderedAt, Date modifiedAt,
			String deleteStatus, Date deletedAt) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.vehicle = vehicle;
		this.orderedServices = orderedServices;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.country = country;
		this.addressType = addressType;
		this.paymentMethod = paymentMethod;
		this.orderedAt = orderedAt;
		this.modifiedAt = modifiedAt;
		this.deleteStatus = deleteStatus;
		this.deletedAt = deletedAt;
	}

	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * @return the orderedServices
	 */
	public List<OrderedService> getOrderedServices() {
		return orderedServices;
	}

	/**
	 * @param orderedServices the orderedServices to set
	 */
	public void setOrderedServices(List<OrderedService> orderedServices) {
		this.orderedServices = orderedServices;
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
	 * @return the addressType
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * @param addressType the addressType to set
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
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
	 * @return the orderedAt
	 */
	public Date getOrderedAt() {
		return orderedAt;
	}

	/**
	 * @param orderedAt the orderedAt to set
	 */
	public void setOrderedAt(Date orderedAt) {
		this.orderedAt = orderedAt;
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
