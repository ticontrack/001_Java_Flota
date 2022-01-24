package com.flota.modelo;

public class Vehiculo {
	
	//ATRIBUTOS
	 public String matricula; 
	 private double cargaMaxima;// = 3000.0;
	 private double cargaActual = 0.0;
	 private int numCajas = 0;
	 
	 String color; //default o de paquete
	 protected String modelo;
	 
	 //VARIABLES DE CLASE
	 //solo 1 para toda la aplicación
	 private static double cargaMaxPorDefecto = 30000;
	 
	
	//CONSTRUCTORES
	 
	 public Vehiculo() {
		 super();
	 }
	 
	 
	 public Vehiculo(String matricula, double cargaMaxima) {
			super();
			this.matricula = matricula;  //mal a proposito
			this.cargaMaxima = cargaMaxima;
	}
	
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
		this.cargaMaxima = Vehiculo.cargaMaxPorDefecto;
	}

	//METODOS
	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean cargarCaja(Caja caja) {
		boolean cargado = false;
		//si el peso de la caja sumado a la carga actual supera la carga maxima permitida
		//no cargo caja
		if(caja.getPeso() > 0 && this.cargaMaxima >= (this.cargaActual + caja.getPeso()) ) {
			this.cargaActual += caja.getPeso();
			this.numCajas ++;
			cargado = true;
		}
		return cargado;
	}
	
	
	public double getCargaActual() {
		return cargaActual;
	}
	
	public int getNumCajas() {
		return numCajas;
	}
	
	
}
