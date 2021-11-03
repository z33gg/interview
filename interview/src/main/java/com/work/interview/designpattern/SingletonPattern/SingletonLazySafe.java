package com.work.interview.designpattern.SingletonPattern;

public class SingletonLazySafe {
	private static SingletonLazySafe instance;
	private SingletonLazySafe(){}
	public static synchronized SingletonLazySafe getInstance(){
		if (instance == null){
			instance = new SingletonLazySafe();
		}
		return instance;
	}
	public void showMessage(){
		System.out.println("lazy safe");
	}
}
