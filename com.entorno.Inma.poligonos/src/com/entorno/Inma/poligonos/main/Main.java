package com.entorno.Inma.poligonos.main;

import com.entorno.Inma.poligonos.figuras.Circulo;
import com.entorno.Inma.poligonos.figuras.Rectangulo;

public class Main {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(5, 10);

		Rectangulo r2 = new Rectangulo();

		/*
		 * Crear un array con cinco circulos con radio aleatorio y comprobar la salida
		 * del depurador. Crearlos con un bucle. Poner e breakpoint en el FOR.
		 */

		Circulo[] array = new Circulo[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = new Circulo();
		}

	}

}
