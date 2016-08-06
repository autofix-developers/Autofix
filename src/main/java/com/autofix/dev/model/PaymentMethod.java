package com.autofix.dev.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class PaymentMethod {
	
	private int methodId;
	private String name;
	
	public PaymentMethod() {
		super();
	}

	/**
	 * @param methodId
	 * @param name
	 */
	public PaymentMethod(int methodId, String name) {
		super();
		this.methodId = methodId;
		this.name = name;
	}

	/**
	 * @return the methodId
	 */
	public int getMethodId() {
		return methodId;
	}

	/**
	 * @param methodId the methodId to set
	 */
	public void setMethodId(int methodId) {
		this.methodId = methodId;
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

}
