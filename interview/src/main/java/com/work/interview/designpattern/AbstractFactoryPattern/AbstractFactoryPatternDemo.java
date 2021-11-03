package com.work.interview.designpattern.AbstractFactoryPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class AbstractFactoryPatternDemo {
	@Test
	public void get(){
		AbstractFactory colorFactory = FactorpProducer.getFacory("COLOR");
		colorFactory.getColor("RED").fill();
		AbstractFactory teacherFactory = FactorpProducer.getFacory("TEACHER");
		teacherFactory.getTeacher("MathTeacher").teach();
	}
}
