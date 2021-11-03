package com.work.interview.designpattern.SingletonPattern;

public class SingletonLazyUnsafe {
	private static SingletonLazyUnsafe instance;
	private SingletonLazyUnsafe(){}
	public static SingletonLazyUnsafe getInstance(){
		if (instance == null){
			instance = new SingletonLazyUnsafe();
		}
		return instance;
	}
	public void showMessage(){
		System.out.println("lazy unsafe");
	}
}
