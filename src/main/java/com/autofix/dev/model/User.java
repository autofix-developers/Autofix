package com.autofix.dev.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class User {

	private long userId;
	private String userType;
	private String username;
	private String password;
	private String name;
	private String email;
	private String gender;
	private long phone;
	private String address;
	private String location;
	private Date createdDate;
	private Date modifiedDate;
	private String deleteStatus;
	private Date deletedDate;
	
	public User(){
		
	}
	
	public User(long userId, String userType, String username, String password, String name, 
			String email, String gender, long phone, String address, String location,
			Date createdDate, Date modifiedDate, String deleteStatus, Date deletedDate){
		this.userId = userId;
		this.userType = userType;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.location = location;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.deleteStatus = deleteStatus;
		this.deletedDate = deletedDate;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getDeleteStatus() {
		return deleteStatus;
	}
	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	public Date getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}
	
}