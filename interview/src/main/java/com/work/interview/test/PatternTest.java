package com.work.interview.test;

import com.work.interview.designpattern.StrategyPattern.demo1.CommonOrderHandle;
import com.work.interview.designpattern.StrategyPattern.demo1.OrderContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class PatternTest {
	@Test
	public void strategyTest(){
		OrderContext context = new OrderContext(new CommonOrderHandle());
		context.handleOrder();
		System.out.println("success");
	}
}
