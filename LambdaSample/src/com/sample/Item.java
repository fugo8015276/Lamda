package com.sample;

import java.util.function.Consumer;

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
	
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", discription=" + discription + ", price=" + price + "]";
	}

	public static void save(Consumer<Item> con) {
		Item item = new Item();
		con.accept(item);
		System.out.println("save:" + item);
	}

}
