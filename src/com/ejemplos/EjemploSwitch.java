package com.ejemplos;

public class EjemploSwitch {
	
	enum DiasSemana  { LUNES, MARTES,MIERCOLES ,JUEVES, VIERNES, SABADO , DOMINO};
	
	public static void main(String[] args) {
		
		final String BASICO = "BASICO";
		String modelo= "LUJO";
		
		//char byte short int String Enumeraciones
		switch(modelo) {
				default:
					System.out.println( "motor y ruedas " );
				case "LUJO":
					System.out.println( "pintura metalizada " );
				case "ESTANDAR":
					System.out.println( "radio" );
				case BASICO:
					System.out.println( " rueda de repuesto " );
					
		}
		
		int prioridad= 1;
		switch(prioridad) {
			case 1:
				
				
		
		}
		
		DiasSemana  dia=  DiasSemana.LUNES;
		switch(dia) {
			case LUNES:
				System.out.println("Hoy toca llevar fruta");
				break;
			case MARTES:
				System.out.println("Hoy toca llevar lacteo");
				break;
			default:
				System.out.println("Lo que quieras");
			
		
		}
		
		
		switch(dia) {
			default:
				System.out.println("Lo que quieras");
				break;
			case LUNES:
				System.out.println("Hoy toca llevar fruta");
				break;
			case MARTES:
				System.out.println("Hoy toca llevar lacteo");
				break;
		}	
		
		
	}//fin main
	

}
