package com.rays.collection.sort.comparable;

public class Automobile implements Comparable<Automobile>{
	
	public String color;
	public int gear;
	public String type;
	public int price;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int compareTo(Automobile o) {
		return o.color-this.color;
	}
	



}
