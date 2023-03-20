package com.entorno.Inma.poligonos.figuras;

import java.util.Random;

/**
 * Representa un circulo. Contiene constructores para crear un ciculo dado el radio para crear un
 * ciculo con un radio aleatorio entero entre 1 y 10. Contiene metodos para calcular el area y el perimetro
 * 
 * @version 1.0
 * 
 * @author Inma
 *
 */
public class Circulo {
	private int radio;
	private int area;
	private int perimetro;
	
	
	public Circulo (int radio) {
		this.radio=radio;
	}
	
	/*
	 * Crea un circulo con el radio aleatorio. El radio sera un valor entero entre 1 y 10
	 * 
	 * @see java.util.Random
	 */
	public Circulo () {
		Random numeroAleatorio = new Random();
    	this.radio = numeroAleatorio.nextInt(10)+1;
	}

	/*
	 * El area del circulo
	 */
	public int area() {
		area = (int) Math.PI*(int)Math.pow(radio, 2);
		return area;
	}
	
	
	/*
	 * El perimetro del circulo
	 */
	public int perimetro() {
		perimetro = (int)Math.PI * (radio*2);
		return perimetro;
	}
	
	/*
	 * Escribimos los get y set de esta clase
	 */
	
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public void setPerimetro (int perimetro) {
		this.perimetro = perimetro;
	}
	
	public int getRadio () {
		return radio;
	}
	
	public int getArea() {
		return area;
	}
	
	public int getPerimetro() {
		return perimetro;
	}
	
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
}



