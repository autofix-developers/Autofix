package com.autofix.dev.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class WorkshopPayment {
	private long paymentId;
	private PaymentMethod paymentMethod;
	private Workshop workshop;
	private long amount;
	private String paymentStatus;
	private Date paymentAt;
	
	public WorkshopPayment() {
		super();
	}

	/**
	 * @param paymentId
	 * @param paymentMethod
	 * @param workshop
	 * @param amount
	 * @param paymentStatus
	 * @param paymentAt
	 */
	public WorkshopPayment(long paymentId, PaymentMethod paymentMethod,
			Workshop workshop, long amount, String paymentStatus, Date paymentAt) {
		super();
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.workshop = workshop;
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
	 * @return the workshop
	 */
	public Workshop getWorkshop() {
		return workshop;
	}

	/**
	 * @param workshop the workshop to set
	 */
	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
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
