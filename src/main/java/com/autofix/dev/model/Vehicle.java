package com.autofix.dev.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Vehicle {
	
	private long vehicleId;
	private String name;
	private String category;

	public Vehicle() {
		super();
	}

	/**
	 * @param vehicleId
	 * @param name
	 * @param category
	 */
	public Vehicle(long vehicleId, String name, String category) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
		this.category = category;
	}

	/**
	 * @return the vehicleId
	 */
	public long getVehicleId() {
		return vehicleId;
	}

	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
}
