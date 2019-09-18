package com.tp5.model;

public abstract class SpacialElement {

	private String name;
	protected int x;
	protected int y;
	protected boolean inAir;
	
	public SpacialElement(String name, int x, int y, boolean inAir) {
		
		this.name = name;
		this.x = x;
		this.y = y;
		this.inAir = inAir;
	}
}
