package com.ejemplo.herencia;

import java.util.Date;

public class Empleado {
	protected String nombre;
	protected double salario;
	protected Date fechaNacimiento;

	public String getDetails() {
			return "Nombre: " + nombre + "\n"
               + "Salario: " + salario;
	}

	public void calcularSalario() {
		System.out.println("... salario  " +  salario /12);
	}
	
}
