package com.autofix.dev.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Service {
	
	private int serviceId;
	private String name;
	private String serviceType;
	
	public Service() {
		super();
	}

	/**
	 * @param serviceId
	 * @param name
	 * @param serviceType
	 */
	public Service(int serviceId, String name, String serviceType) {
		super();
		this.serviceId = serviceId;
		this.name = name;
		this.serviceType = serviceType;
	}

	/**
	 * @return the serviceId
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
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
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
