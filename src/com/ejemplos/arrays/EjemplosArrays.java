package com.ejemplos.arrays;

public class EjemplosArrays {

	public static void main(String[] args) {
		

		//declarar un array de tipo primitivo
		
		int[] cantidades;
		
		//inicializo
		cantidades = new int[5]; //crea un objeto array de int con 5 elementos
							     // los inicializa a 0
		
		char[] tablero = new char[3];
		
		tablero[0] = 'X';
		
		//que hay en la posicion 2 
		
		char valor = tablero[2];
		System.out.printf("en la posicion 2 hay %s. %n ", valor);
		valor = tablero[0];
		System.out.printf("en la posicion 0 hay  %s. %n ", valor);
		
		dibujarTablero(tablero);
		
		//PONER MAL
		//tablero[3] = 'X';
		
		
		// VARIAS DIMENSIONES
		
		char[][] tableroJuego = new char[3][3];
		
		
		tableroJuego[0][2] = 'X';
		tableroJuego[2][2] = 'X';
		
		System.out.println("..................................");
		dibujarTableroJuego(tableroJuego);
		
	}
	
	private static void dibujarTablero(char[] tablero) {
		
		for(char celda : tablero) {
			System.out.print(celda + " | " );
		}
		
	}

	
    private static void dibujarTableroJuego(char[][] tablero) {
		
		for(char[] fila : tablero) {
			for(char celda  : fila) {
				if(celda != 'X') {
					System.out.print(" " + " | " );
				}else {
					System.out.print(celda + " | " );
				}
			} //fin 
			System.out.println();
		}//fin 
		
	}//fin metodo
	
	
	

}
