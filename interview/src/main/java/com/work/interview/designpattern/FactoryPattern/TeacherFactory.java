package com.work.interview.designpattern.FactoryPattern;

import com.work.interview.designpattern.AbstractFactoryPattern.AbstractFactory;
import com.work.interview.designpattern.AbstractFactoryPattern.Color;
import org.springframework.util.StringUtils;

public class TeacherFactory extends AbstractFactory {
	@Override
	public Color getColor(String color) {
		return null;
	}

	public Teacher getTeacher(String teacherType){
		if (!StringUtils.hasLength(teacherType)){
			return null;
		}
		if (teacherType.equalsIgnoreCase("EnglishTeacher")){
			return new EnglishTeacher();
		}else if (teacherType.equalsIgnoreCase("MathTeacher")){
			return new MathTeacher();
		}
		return null;
	}

}
