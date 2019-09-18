package com.tp5.model;

import java.util.ArrayList;
import java.util.List;

public class Human extends SpacialElement implements Adopter, Buyer {
	
	private List<House> listhouse = new ArrayList<House>();
	private List<Animal> listanimal = new ArrayList<Animal>();
	private int money;
	
	public Human(String name, int x, int y, boolean inAir, List<House> listhouse, List<Animal> listanimal, int money) {
		super(name, x, y, inAir);
		this.listhouse = listhouse;
		this.listanimal = listanimal;
		this.money = money;
	}

	@Override
	public boolean buy(House h) {
		if(h.getPrice()<this.money && h.proprioHouse == false)
		{
			this.money -= h.getPrice();
			this.listhouse.add(h);
			h.proprioHouse = true;
			return true;
		}
		else
			return false;
			
	}

	@Override
	public boolean sell(House h) {
		h.setPrice((int)(Math.round(0.5*h.getPrice())));
		h.getPrice();
		this.money += h.getPrice();;
		this.listhouse.remove(h);
		return true;
	}

	@Override
	public boolean adopte(Animal a) {
		
		if(a.proprioanimal == false)
		{
			this.listanimal.add(a);
			a.proprioanimal = true;
			return true;
		}
		else 
			return false;
		
		
	}

	@Override
	public boolean revoke(Animal a) {
		
		this.listanimal.remove(a);

		return true;
	}

	public List<House> getListhouse() {
		return listhouse;
	}

	public void setListhouse(List<House> listhouse) {
		this.listhouse = listhouse;
	}

	public List<Animal> getListanimal() {
		return listanimal;
	}

	public void setListanimal(List<Animal> listanimal) {
		this.listanimal = listanimal;
	}

	@Override
	public String toString() {
		return "Human [listhouse=" + listhouse + ", listanimal=" + listanimal + ", money=" + money + "]";
	}
	
	
	
}
