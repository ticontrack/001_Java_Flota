package com.ejemplos.arrays;

public class EjemploArrayDePuntos {
	
	public static void main(String[] args) {
		
	
		Punto[] triangulo = new Punto[3];
		
		for(Punto p : triangulo) {
			System.out.println(p);
		}
		
		triangulo[0] = new Punto(0,0);
		triangulo[1] = new Punto(7,0);
		triangulo[2] = new Punto(5,3);

		System.out.println(" Coordena x del primer punto "+ triangulo[0].getX());
		
		
		for(Punto p : triangulo) {
			System.out.println(p);   //p.toString();
		}
		

		Punto[] figura;
		figura = new Punto[3];
		
		figura[0]= new Punto(3,3);
		
		
		Punto[][] figura2;
		figura2 = new Punto[3][];
		
		figura2[0] = new Punto[5];
		figura2[1] = new Punto[2];
		figura2[2] = new Punto[6];
		
		figura2[0][4] =new Punto(3,8);
		
		for(Punto[] f : figura2) {
			for(Punto p : f) {
				System.out.print(p   + " - ");
			}
			System.out.println();
		}

		
	}

}
