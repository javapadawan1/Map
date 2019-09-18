package com.tp5.model;

import java.util.ArrayList;
import java.util.List;

public class House extends SpacialElement {

	private int price;
	private Ematerial ematerial;
	private Human human;
	public boolean proprioHouse = false;
	
	public House(String name, int x, int y, boolean inAir, int price, Ematerial ematerial, Human human) {
		super(name, x, y, inAir);
		this.price = price;
		this.ematerial = ematerial;
		this.human = human;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
