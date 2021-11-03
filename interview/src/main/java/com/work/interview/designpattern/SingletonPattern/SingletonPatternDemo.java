package com.work.interview.designpattern.SingletonPattern;

import org.junit.Test;

public class SingletonPatternDemo {
	@Test	//hungry safe
	public void test1() {
		SingleObject instance = SingleObject.getInstance();
		instance.showMessage();
	}
	@Test	//lazy unsafe
	public void test2(){
		SingletonLazyUnsafe.getInstance().showMessage();
	}
	@Test	//lazy safe
	public void test3(){
		SingletonLazySafe.getInstance().showMessage();
	}
	@Test
	public void test4(){
		SingletonDoubleCheckSafe.getInstance().showMessage();
	}
	@Test
	public void test5(){
		SingletonStaticSafe.getInstance().showMessage();
	}
	@Test
	public void test6(){
		SingletonEnum.INSTANCE.showMessage();
	}
	/*
		一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
	只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
	如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
	*/
}
