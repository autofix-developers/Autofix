package com.autofix.dev.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Feedback {
	private long feedbackId;
	private User user;
	private String message;
	private Date feedbackAt;
	
	public Feedback() {
		super();
	}

	/**
	 * @param feedbackId
	 * @param user
	 * @param message
	 * @param feedbackAt
	 */
	public Feedback(long feedbackId, User user, String message, Date feedbackAt) {
		super();
		this.feedbackId = feedbackId;
		this.user = user;
		this.message = message;
		this.feedbackAt = feedbackAt;
	}

	/**
	 * @return the feedbackId
	 */
	public long getFeedbackId() {
		return feedbackId;
	}

	/**
	 * @param feedbackId the feedbackId to set
	 */
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the feedbackAt
	 */
	public Date getFeedbackAt() {
		return feedbackAt;
	}

	/**
	 * @param feedbackAt the feedbackAt to set
	 */
	public void setFeedbackAt(Date feedbackAt) {
		this.feedbackAt = feedbackAt;
	}

}
