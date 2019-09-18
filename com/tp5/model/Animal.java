package com.tp5.model;

public abstract class Animal extends Being {

	private Human human;
	public boolean proprioanimal = false;
	
	public Animal(String name, int x, int y, boolean inAir, int maxspeed, Human human) {
		super(name, x, y, inAir, maxspeed);
		this.human = human;
		
	}


	public abstract String communicate();

	
}
