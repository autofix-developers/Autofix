package com.autofix.dev.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Accessory {
	private int accessoryId;
	private String name;
	private int price;
	private String category;
	
	public Accessory() {
		super();
	}

	/**
	 * @param accessoryId
	 * @param name
	 * @param price
	 * @param category
	 */
	public Accessory(int accessoryId, String name, int price, String category) {
		super();
		this.accessoryId = accessoryId;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	/**
	 * @return the accessoryId
	 */
	public int getAccessoryId() {
		return accessoryId;
	}

	/**
	 * @param accessoryId the accessoryId to set
	 */
	public void setAccessoryId(int accessoryId) {
		this.accessoryId = accessoryId;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
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
