package com.tp5.model;

public class Eagle extends Animal implements Flying{

	public Eagle(String name, int x, int y, boolean inAir, int maxspeed, Human human) {
		super(name, x, y, inAir, maxspeed, human);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean takeOff() {
		if(inAir == false)
			inAir = true;
		
		return inAir;
	}

	@Override
	public boolean land() {
		if(inAir)
			inAir = false;
		return inAir;
	}
	
}
