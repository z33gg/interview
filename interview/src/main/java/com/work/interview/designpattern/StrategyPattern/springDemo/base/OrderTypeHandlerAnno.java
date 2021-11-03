package com.work.interview.designpattern.StrategyPattern.springDemo.base;

import com.work.interview.designpattern.StrategyPattern.orderEnum.OrderEnum;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface OrderTypeHandlerAnno {
	OrderEnum value();
}
