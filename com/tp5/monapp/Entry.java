package com.tp5.monapp;

import java.util.ArrayList;

import com.tp5.model.Animal;
import com.tp5.model.Chicken;
import com.tp5.model.Eagle;
import com.tp5.model.Ematerial;
import com.tp5.model.House;
import com.tp5.model.Human;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void test()
	{
	
			Chicken kfc1 = new Chicken("kfc", 10, 0, false, 1, null);
			Chicken kfc2 = new Chicken("kfc2", 11, 0, false, 1,null);
			
			ArrayList<Animal> listan2 = new ArrayList<Animal>();
			listan2.add(kfc1);listan2.add(kfc2);
			
			Human jack = new Human("jack", 50, 60, false, null, null, 5000);
			Human bob = new Human("bob", -50, -60, false, null, null, 10000);
			
			Eagle aigle = new Eagle("aigle", 70, 30, true, 1, null);
			
			House villa = new House("vila", 20, 20, false, 1000, Ematerial.Brick, )
					
			
			
					
	}
}
