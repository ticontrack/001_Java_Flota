package com.flota.pruebas;

import java.io.File;

import com.flota.modelo.Caja;
import com.flota.modelo.Vehiculo;

public class PruebasVehiculo {

	public static void main(String[] args) {
	   
		
		Vehiculo v1 = new Vehiculo("A222",4000);
		
		v1 = new Vehiculo("B11",6000);
		
		v1.setCargaMaxima(200);
		
		System.out.printf("El camión tiene una capacida de %f kg de carga. %n" , v1.getCargaMaxima());
		
		
		v1.cargarCaja(new Caja());
		v1.cargarCaja(new Caja());
		
		
		
		System.out.printf("carga actual %f  kg y  %d cajas cargadas." 
				, v1.getCargaActual()
				, v1.getNumCajas());
		
		
		Vehiculo furgo = new Vehiculo("X3333");
		
		
		System.out.println("Tu matricula es " + v1.getMatricula().toUpperCase() );
		
	
		//tipos primitivos:  8 tipos 
		
		//boolean  - true/false
		
		//char   - 1 caracter  1 byte
		
		//enteros  
		// byte ,     short,          int ,        long
		//  8 bit   16 bits,   32 bits,  64 bits
		
		byte numero = 127; //-s27 a 128
		
		int numeroInt = 145;
		
		byte otroByte =  (byte) numeroInt;
		
		System.out.println("int " + numeroInt);
		System.out.println("byte " + otroByte);
		
		
		//decimales
		// float , double
		//  32 bits    64 bits
		
		double  d = 86899999999999999999899888888888889.998880;  //64 bits
		
		//float f = d; //d ocupa 64 bits  ->no cabe en 32 bits
		
		float f =(float)d; // casting
		
		float f2 = 9.0f;  // 9.0 es un literal double
		
	    double otroDouble = f2;
	    
	    
	    System.out.println("f... " + f);
	    System.out.println("d... " + d);
		
		
		
		
		// CLASIFICACION 2  -- por ámbito
	    
	    //1 variables de clase  - static
	    
	     //se declaran como los atributos
	    // pero con la palabra static
	    // solo hay una por clase
	    
	    
	    
	    //2 variables de instancia
	    //---------------------------------------
	    // declaradas como atributos de la clase
	    
	    //creo un objeto de la clase Caja
	    //Creo una instancia de la clase Caje
	    // en Memoria RAM  creo un objeot Caja
	    // con el atributo peso (var de instancia)
	    // viven el tiempo que vive el objeto
	    Caja c = new Caja(); 
	    
	    
	    //3  variables locales
	    // son las variables que se declaran dentro
	    // de un método, constructor, argumentos de 
	    // un método ...
	    // vive hasta salir del bloque de código  {}
	    // donde fue declarado
	    
	    if (true) {
	    	int a = 0;
	    	a++;
	    }
	    //aqui ya no exist a
	   //  a = a +9;
	    
	    
	
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
