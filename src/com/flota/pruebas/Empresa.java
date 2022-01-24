package com.flota.pruebas;

import com.flota.modelo.*;

public class Empresa {
	
	private Vehiculo vehiculo;
	
	public Empresa(Vehiculo v) {
		this.vehiculo =v;
	}
	
	public void hazALgo() {
		this.vehiculo.color = "RED"; //default paquete
		this.vehiculo.matricula = "A34232";   //public
		this.vehiculo.cargaMaxima = 2333.0; //private
		this.vehiculo.modelo = "FORD"; //protected 
	}

}
