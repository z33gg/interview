package com.work.interview.designpattern.AbstractFactoryPattern;

import com.work.interview.designpattern.FactoryPattern.Teacher;
import org.springframework.util.StringUtils;

public class ColorFactory extends AbstractFactory{
	@Override
	public Color getColor(String color) {
		if (!StringUtils.hasLength(color)){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		} else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		return null;
	}

	@Override
	public Teacher getTeacher(String teacher) {
		return null;
	}
}
