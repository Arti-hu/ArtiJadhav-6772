package com.constructor;

public class Laptop 
{
  private String name;
  private int quantity;
  private double price;

  public Laptop(String name, int quantity, double price) 
  {
	super();
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}

public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Laptop [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
}
  
  
  
}
