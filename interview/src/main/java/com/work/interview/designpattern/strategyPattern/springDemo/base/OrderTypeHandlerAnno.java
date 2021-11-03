package com.work.interview.designpattern.strategyPattern.springDemo.base;

import com.work.interview.designpattern.strategyPattern.orderEnum.OrderEnum;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface OrderTypeHandlerAnno {
	OrderEnum value();
}
