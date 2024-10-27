package com.sample;

public class Factory {
	public static Sample create() {
		return new Factory().new InnerSample();
	}
	
//	下記のInnserクラスは、privateクラスのため、他クラスから使えないが、このクラス内ならどこでも呼び出せる。
	private class InnerSample implements Sample{
		@Override
		public void execute() {
			System.out.println("Inner Class");
		}
	}

}
