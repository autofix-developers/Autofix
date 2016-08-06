package com.autofix.dev.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class UserPayment {
	private long paymentId;
	private PaymentMethod paymentMethod;
	private User user;
	private long amount;
	private String paymentStatus;
	private Date paymentAt;
	
	public UserPayment() {
		super();
	}

	/**
	 * @param paymentId
	 * @param paymentMethod
	 * @param user
	 * @param amount
	 * @param paymentStatus
	 * @param paymentAt
	 */
	public UserPayment(long paymentId, PaymentMethod paymentMethod, User user,
			long amount, String paymentStatus, Date paymentAt) {
		super();
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.user = user;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.paymentAt = paymentAt;
	}

	/**
	 * @return the paymentId
	 */
	public long getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
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
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	/**
	 * @return the paymentAt
	 */
	public Date getPaymentAt() {
		return paymentAt;
	}

	/**
	 * @param paymentAt the paymentAt to set
	 */
	public void setPaymentAt(Date paymentAt) {
		this.paymentAt = paymentAt;
	}
	
}
