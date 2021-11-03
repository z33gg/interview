package com.work.interview.designpattern.SingletonPattern;

public class SingletonDoubleCheckSafe {
	private volatile static SingletonDoubleCheckSafe instance;
	private SingletonDoubleCheckSafe(){}
	public static SingletonDoubleCheckSafe getInstance(){
		if (instance == null){
			synchronized(SingletonDoubleCheckSafe.class){
				if (instance == null){
					instance = new SingletonDoubleCheckSafe();
				}
			}
		}
		return instance;
	}
	public void showMessage(){
		System.out.println("DoubleCheck safe");
	}
}
