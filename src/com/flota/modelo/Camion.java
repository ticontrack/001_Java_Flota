package com.flota.modelo;

public class Camion extends Vehiculo{
	
	
	public void hacerAlgoComoCanions() {
		
		//por herencia
		this.matricula = "AAAA"; //public
		this.cargaMaxima = 000.0; //private
		this.color = "red";  //package
		this.modelo= "TOYOTA";  //protected
	}

}
