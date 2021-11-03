package com.work.interview.designpattern.AbstractFactoryPattern;


import com.work.interview.designpattern.FactoryPattern.TeacherFactory;

public class FactorpProducer {
	public static AbstractFactory getFacory(String choice){
		if(choice.equalsIgnoreCase("TEACHER")){
			return new TeacherFactory();
		} else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
