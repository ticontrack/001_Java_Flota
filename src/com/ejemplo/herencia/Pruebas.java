package com.ejemplo.herencia;

import com.flota.modelo.Caja;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Empleado e = new Empleado();
		e.nombre ="Laura";
		e.salario = 30000;
		System.out.println(e.getDetails());
		
		Gerente g = new Gerente();
		g.nombre = "Marcos";
		g.salario = 40500.9;
		g.departamento = "Marketing";
		System.out.println(g.getDetails());

		
		Empleado laura = new Empleado(); // new Gerente();
		laura.nombre = "Laura Roca";
		laura.salario = 30000;
		
		laura.calcularSalario();
		
		
		Programador p = new Programador();
		p.nombre = "Begoña";
		p.salario = 30000;
		p.getDetails();
		p.programar("Java");
		
		GestionNominas.generaNomina(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
