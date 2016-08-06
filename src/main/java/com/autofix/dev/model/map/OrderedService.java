package com.autofix.dev.model.map;

import com.autofix.dev.model.Order;
import com.autofix.dev.model.Service;

public final class OrderedService {

	private Order order;
	private Service service;
	
	public OrderedService() {
		super();
	}

	/**
	 * @param order
	 * @param service
	 */
	public OrderedService(Order order, Service service) {
		super();
		this.order = order;
		this.service = service;
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
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}
	
}
