package com.work.interview.designpattern.AbstractFactoryPattern;

import com.work.interview.designpattern.FactoryPattern.Teacher;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Teacher getTeacher(String teacher);
}
