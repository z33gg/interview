package com.work.interview.designpattern.SingletonPattern;

public class SingletonStaticSafe {
	private static class SingletonHolder {
		private static final SingletonStaticSafe INSTANCE = new SingletonStaticSafe();
	}
	private SingletonStaticSafe (){}
	public static final SingletonStaticSafe getInstance() {
		return SingletonHolder.INSTANCE;
	}
	public void showMessage(){
		System.out.println("Static safe");
	}
}
