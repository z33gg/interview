package com.work.interview.designpattern.StrategyPattern.springDemo;

import com.work.interview.designpattern.StrategyPattern.dto.OrderDTO;
import com.work.interview.designpattern.StrategyPattern.orderEnum.OrderEnum;
import com.work.interview.designpattern.StrategyPattern.springDemo.base.OrderTypeHandlerAnno;
import org.springframework.stereotype.Component;

@Component
@OrderTypeHandlerAnno(OrderEnum.Common)
public class SpringCommonOrderHandle implements OrderHandleService{
	@Override
	public String orderHandle(OrderDTO dto) {
		return "SpringCommonOrderHandle";
	}
}
