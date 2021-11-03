package com.work.interview.designpattern.strategyPattern.springDemo.base;

import com.work.interview.designpattern.strategyPattern.springDemo.OrderHandleService;
import org.springframework.util.StringUtils;

import java.util.Map;

public class SpringOrderHandleContext {

	private Map<String, OrderHandleService> handleMap;

	public SpringOrderHandleContext(Map<String, OrderHandleService> handleMap) {
		this.handleMap = handleMap;
	}

	public OrderHandleService getInstance (String type){
		if (!StringUtils.hasLength(type)) {
			throw new IllegalArgumentException("type不能为空");
		}
		OrderHandleService handleService = handleMap.get(type);
		if (handleService == null){
			throw new IllegalArgumentException("该类型没有在枚举类中定义");
		}
		return handleService;
	}
}
