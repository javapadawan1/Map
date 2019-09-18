package com.tp5.model;

public abstract class Being extends SpacialElement implements Movable {

	protected int maxspeed =1;

	public Being(String name, int x, int y, boolean inAir, int maxspeed) {
		super(name, x, y, inAir);
		this.maxspeed = maxspeed;
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
