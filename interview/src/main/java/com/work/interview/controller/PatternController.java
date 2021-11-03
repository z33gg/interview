package com.work.interview.controller;

import com.work.interview.designpattern.StrategyPattern.dto.OrderDTO;
import com.work.interview.service.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class PatternController {
	@Autowired
	private PatternService service;

	@RequestMapping("/orderHandle")
	public String orderHandle(@RequestBody OrderDTO dto){
		return service.orderHandle(dto);
	}
}
