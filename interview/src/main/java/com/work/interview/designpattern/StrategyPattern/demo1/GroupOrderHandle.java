package com.work.interview.designpattern.StrategyPattern.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GroupOrderHandle implements OrderHandle{
	@Override
	public String handle() {
		return "groupOrderHandle";
	}
}
