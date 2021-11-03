package com.work.interview.designpattern.FactoryPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class FactoryPatternDemo {
	@Test
	public void getTeacher(){
		TeacherFactory factory = new TeacherFactory();
		factory.getTeacher("MathTeacher").teach();
	}
}
