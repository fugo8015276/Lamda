package com.sample;

public class Item {
	private String id;
	private String name;
	private String discription;
	private int price;

	public Item id(String id) {
		this.id = id;
		return this;
	}

	public Item name(String name) {
		this.name = name;
		return this;

	}

	public Item discription(String discription) {
		this.discription = discription;
		return this;

	}

	public Item price(int price) {
		this.price = price;
		return this;

	}

}
