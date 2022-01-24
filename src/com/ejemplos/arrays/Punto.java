package com.ejemplos.arrays;

public class Punto extends Object {
	
	//ATRIBUTOS
	private int x;
	private int y;
	
	//CONSTRUCTOR
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//GETTERS
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	
	
	//sobreescribir - camibar la implementación delmetodo que hemos heredado
	
	
	@Override
	public String toString() {
		return "[" + x + "," + y +"]";
	}
	
	

}
