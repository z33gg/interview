package com.work.interview.designpattern.StrategyPattern.springDemo.base;

import com.work.interview.designpattern.StrategyPattern.orderEnum.OrderEnum;
import com.work.interview.designpattern.StrategyPattern.springDemo.OrderHandleService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class SpringOrderHandleProcesser implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Map<String, OrderHandleService> handleMap = new HashMap<>();
		for (OrderEnum orderEnum : OrderEnum.values()) {
			OrderHandleService handleService = getBeansWithAnnotation(beanFactory, OrderHandleService.class, OrderTypeHandlerAnno.class, orderEnum.getCode());
			handleMap.put(orderEnum.getCode(),handleService);
		}
		SpringOrderHandleContext context = new SpringOrderHandleContext(handleMap);
		beanFactory.registerSingleton(SpringOrderHandleContext.class.getName(),context);
	}
	private <T> T  getBeansWithAnnotation(ConfigurableListableBeanFactory beanFactory,Class<T> manager,
								 Class<? extends OrderTypeHandlerAnno> annotation,String code)throws BeansException{
		if (!StringUtils.hasLength(code)){
			throw new RuntimeException("code is null");
		}
		Collection<T> tCollection = beanFactory.getBeansOfType(manager).values();
		for (T t : tCollection) {
			OrderTypeHandlerAnno handlerAnno = t.getClass().getAnnotation(annotation);
			if (ObjectUtils.isEmpty(handlerAnno)){
				throw new RuntimeException("该注解没有写入值:"+code);
			}
			if (code.equals(handlerAnno.value().getCode())){
				return t;
			}
		}
		throw new RuntimeException("通过code没有找到该注解对应的实体类 :"+code);
	}
}
