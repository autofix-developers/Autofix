package com.autofix.dev.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class OrderStatus {
	private Order order;
	private String status;
	private long amount;
	private String userResponse;
	
	public OrderStatus() {
		super();
	}

	/**
	 * @param order
	 * @param status
	 * @param amount
	 * @param userResponse
	 */
	public OrderStatus(Order order, String status, long amount,
			String userResponse) {
		super();
		this.order = order;
		this.status = status;
		this.amount = amount;
		this.userResponse = userResponse;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}

	/**
	 * @return the userResponse
	 */
	public String getUserResponse() {
		return userResponse;
	}

	/**
	 * @param userResponse the userResponse to set
	 */
	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}

}
