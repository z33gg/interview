package com.work.interview.designpattern.strategyPattern.springDemo;

import com.work.interview.designpattern.strategyPattern.dto.OrderDTO;

public interface OrderHandleService {
	abstract String orderHandle (OrderDTO dto);
}
