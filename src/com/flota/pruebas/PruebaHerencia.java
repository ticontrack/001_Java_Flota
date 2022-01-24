package com.flota.pruebas;

import com.flota.modelo.Vehiculo;

public class PruebaHerencia {
	
	public static void main(String[] args) {
		
		Vehiculo v = new Vehiculo("A2222",2000.0);
		
		// VISIBILIDAD
		v.matricula= "A3333";     //public
		v.cargaMaxima  =  2399.0; //private
		
		
	}

}
