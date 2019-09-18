package com.tp5.model;

public class MobilHome extends House implements Movable{

	public MobilHome(String name, int x, int y, boolean inAir, int price, Ematerial ematerial, Human human) {
		super(name, x, y, inAir, price, ematerial, human);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean goUp(int speed) {
		this.x += speed;
		return true;
	}

	@Override
	public boolean goDown(int speed) {
		this.x -= speed;
		return true;
	}

	@Override
	public boolean goRight(int speed) {
		this.y += speed;
		return true;
		
	}

	@Override
	public boolean goLeft(int speed) {
		this.y -= speed;
		return true;
	}
}
