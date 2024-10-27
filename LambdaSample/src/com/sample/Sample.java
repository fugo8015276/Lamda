package com.sample;


@FunctionalInterface //関数型インターフェースだと定義することができる。
public interface Sample {
	public void execute();
//	public void test(); 2つめのメソッドを記載すると、ラムダ式を代入するメソッドが特定できなくなる。
}
