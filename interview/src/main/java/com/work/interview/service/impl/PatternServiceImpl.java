package com.work.interview.service.impl;

import com.work.interview.designpattern.strategyPattern.dto.OrderDTO;
import com.work.interview.designpattern.strategyPattern.springDemo.OrderHandleService;
import com.work.interview.designpattern.strategyPattern.springDemo.base.SpringOrderHandleContext;
import com.work.interview.service.PatternService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PatternServiceImpl implements PatternService {
	@Autowired
	private SpringOrderHandleContext orderContext;
	@Override
	public String orderHandle(OrderDTO dto) {
		log.info("请求开始:"+dto.toString());
		OrderHandleService handleService = orderContext.getInstance(dto.getOrderType());
		return handleService.orderHandle(dto);
	}
}
