package org.cuatrovientos.greet;


/**
 * greets in different languages
 * @author Iván Galván
 */
public class Greet {

	/**
	 * Greets 
	 * @param language chosen language
	 * @param repeat how many times repeat greet
	 * @return a String with the greeting
	 */
	
	public String greet (int language, int repeat) {
		String result = "";
		String currentGreet = "";
		
		switch (language) {
			case 0 : currentGreet = "hola";
					 break;
			case 1 : currentGreet = "hello";
					 break;
			case 2 : currentGreet = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int i=0;i<repeat;i++) {
			result += currentGreet;
		}
		
		return result;
	}

	
}
