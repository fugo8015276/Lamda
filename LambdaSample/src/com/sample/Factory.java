package com.sample;

public class Factory {
	public static Sample create() {
//		Sample型のインタフェースでもインスタンス化可能。またその中でメソッド等を定義して、これをMainクラスで使うことができる。
//		無名クラスとして定義
		return new Sample() {
			@Override
			public void execute() {
				System.out.println("test");
			}
		};
	}

}
