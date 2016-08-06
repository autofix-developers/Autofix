package com.autofix.dev.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Session {
	private String sessionId;
	private User user;
	private String status;
	private String result;
	private Date createdAt;
	private Date closedAt;
	
	public Session() {
		super();
	}

	/**
	 * @param sessionId
	 * @param user
	 * @param status
	 * @param result
	 * @param createdAt
	 * @param closedAt
	 */
	public Session(String sessionId, User user, String status, String result,
			Date createdAt, Date closedAt) {
		super();
		this.sessionId = sessionId;
		this.user = user;
		this.status = status;
		this.result = result;
		this.createdAt = createdAt;
		this.closedAt = closedAt;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
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
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the closedAt
	 */
	public Date getClosedAt() {
		return closedAt;
	}

	/**
	 * @param closedAt the closedAt to set
	 */
	public void setClosedAt(Date closedAt) {
		this.closedAt = closedAt;
	}

}
