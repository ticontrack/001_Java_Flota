package com.flota.modelo;

public class Caja {

	// ATRIBUTOS  - variable de instancia
	private double peso = 10;
	
	//CONSTRUCTORES
	
	
	//MÉTODOS
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0)  this.peso = peso;
	}
	
	public double calcularPesoNewtons() {
		
		double pesoNw = 0; //variable local
		pesoNw = this.peso * 1.2;
		return pesoNw;
		
	}
	
	
	
} //fin clase
