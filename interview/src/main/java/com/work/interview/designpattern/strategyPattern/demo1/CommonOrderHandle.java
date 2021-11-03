package com.work.interview.designpattern.strategyPattern.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonOrderHandle implements OrderHandle{
	@Override
	public String handle() {
		return "commonOrderHandle";
	}
}
