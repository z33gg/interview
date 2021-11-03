package com.work.interview.designpattern.strategyPattern.springDemo;

import com.work.interview.designpattern.strategyPattern.dto.OrderDTO;
import com.work.interview.designpattern.strategyPattern.orderEnum.OrderEnum;
import com.work.interview.designpattern.strategyPattern.springDemo.base.OrderTypeHandlerAnno;
import org.springframework.stereotype.Component;

@Component
@OrderTypeHandlerAnno(OrderEnum.Group)
public class SpringGroupOrderHandle implements OrderHandleService{
	@Override
	public String orderHandle(OrderDTO dto) {
		return "SpringGroupOrderHandle";
	}
}
