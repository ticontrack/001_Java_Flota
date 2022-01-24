package com.flota.pruebas;

import com.flota.modelo.Vehiculo;

public class CamionEnOtroPaquete extends Vehiculo{
	
	
	public void hacerAlgoComoCamion() {
		
		//por herencia
		this.matricula = "AAAA"; //public
		this.cargaMaxima = 000.0; //private
		this.color = "red";  //package
		this.modelo= "TOYOTA";  //protected
	}

}
