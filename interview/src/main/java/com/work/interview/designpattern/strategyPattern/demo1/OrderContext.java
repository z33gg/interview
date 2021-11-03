package com.work.interview.designpattern.strategyPattern.demo1;

public class OrderContext {

	private OrderHandle orderHandle;

	public OrderContext(OrderHandle orderHandle) {
		this.orderHandle = orderHandle;
	}

	public String handleOrder(){
		return orderHandle.handle();
	}
}
