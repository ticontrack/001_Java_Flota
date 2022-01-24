package com.ejemplo.herencia;

public class Gerente extends Empleado{
	
	protected String departamento;
	
//	@Override
//	public String getDetails() {
//		return "Nombre: " + nombre + "\n"
//           + "Salario: " + salario  + "\n"
//           + "Departamento: " + departamento;
//	}

	@Override
	public String getDetails() {
		return super.getDetails() + "\n"
           + "Departamento: " + departamento;
	}

	@Override
	public void calcularSalario() {
		System.out.println(".... salario gerente " +( salario/12 +200));
	}

	
	
	
    
	
}
