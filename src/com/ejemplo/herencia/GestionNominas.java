package com.ejemplo.herencia;

public class GestionNominas {
	
	
	public static void  generaNomina(Empleado e) {
		


	//	e.programar("Java");
		System.out.println("..... NÓMINA .......");
		e.calcularSalario();
		System.out.println(e.getDetails());
		
		
		Gerente g = (Gerente)e;
		
		//si es programaro de doy un plus
		if(e instanceof Programador) {
			System.out.println("tiene un plus de 100 euros");
			Programador p = (Programador)e;
			p.programar("PHP");
		}
	}

}
