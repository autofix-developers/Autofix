package com.autofix.dev.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Offer {
	private long offerId;
	private String description;
	private Date startAt;
	private Date expireAt;
	private User user;
	private String offerType;
	private String promoCode;
	
	public Offer() {
		super();
	}

	/**
	 * @param offerId
	 * @param description
	 * @param startAt
	 * @param expireAt
	 * @param user
	 * @param offerType
	 * @param promoCode
	 */
	public Offer(long offerId, String description, Date startAt, Date expireAt,
			User user, String offerType, String promoCode) {
		super();
		this.offerId = offerId;
		this.description = description;
		this.startAt = startAt;
		this.expireAt = expireAt;
		this.user = user;
		this.offerType = offerType;
		this.promoCode = promoCode;
	}

	/**
	 * @return the offerId
	 */
	public long getOfferId() {
		return offerId;
	}

	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the startAt
	 */
	public Date getStartAt() {
		return startAt;
	}

	/**
	 * @param startAt the startAt to set
	 */
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	/**
	 * @return the expireAt
	 */
	public Date getExpireAt() {
		return expireAt;
	}

	/**
	 * @param expireAt the expireAt to set
	 */
	public void setExpireAt(Date expireAt) {
		this.expireAt = expireAt;
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
	 * @return the offerType
	 */
	public String getOfferType() {
		return offerType;
	}

	/**
	 * @param offerType the offerType to set
	 */
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	/**
	 * @return the promoCode
	 */
	public String getPromoCode() {
		return promoCode;
	}

	/**
	 * @param promoCode the promoCode to set
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	
}
