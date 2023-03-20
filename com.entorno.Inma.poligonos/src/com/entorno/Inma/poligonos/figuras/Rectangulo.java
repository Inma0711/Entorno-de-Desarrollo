package com.entorno.Inma.poligonos.figuras;

import java.util.Random;

/**
 *
 * @author Inma
 *@version 1.0
 */

	public class Rectangulo {
	    
	    int altura;
	    int anchura;
	    
	    /**
	     * Crea un rectangulo con la altura y la anchura especificadas.
	     * 
	     * @param altura       la altura del rectangulo
	     * @param anchura   la anchura del rectangulo
	     */
	    
	    public Rectangulo (int altura, int anchura) {
	        this.altura= altura;
	        this.anchura = anchura;
	    }
	    
	    
	    /*
	     * Crea un rectangulo con la altura y la anchura aleatoria. Ambas seran numeros aletarios 
	     * enteros entre 1 y 10
	     */
	    
	    public Rectangulo () {
	    	Random numeroAleatorio = new Random();
	    	this.altura = numeroAleatorio.nextInt(10)+1;
	    	this.anchura = numeroAleatorio.nextInt(10)+1;
	    }
	    
	    
	    /**
	     * Devuelve el perimetro del rectangulo, es decir la suma de todos los lados.
	     * 
	     * @return el perimetro del rectangulo
	     */
	    
	    public int perimetro() {                    
	        return altura*2 + anchura*2;
	    }
	    
	    
	    /**
	     * Devuelve el area del rectangulo
	     * 
	     * @return el area del rectangulo
	     */
	    
	    public int area() {
	        return altura*anchura;
	    }
	}

	

