package com.work.interview.designpattern.StrategyPattern.springDemo;

import com.work.interview.designpattern.StrategyPattern.dto.OrderDTO;

public interface OrderHandleService {
	abstract String orderHandle (OrderDTO dto);
}
