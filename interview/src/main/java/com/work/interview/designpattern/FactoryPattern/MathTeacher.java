package com.work.interview.designpattern.FactoryPattern;

public class MathTeacher implements Teacher{
	@Override
	public void teach() {
		System.out.println("MathTeacher");
	}
}
