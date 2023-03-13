package slnEjercicios789;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 
 * @author Pedro
 *Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.  *Recorre ambos mostrando únicamente el valor 
 *de cada elemento.
 *
 *NOTA IMPORTANTE---> Por favor no uses el .clone() puesto que es una copia superficial, si modificas en un elemento de la lista
 *copiada, modificarás también ese elemento de la lista original y viceversa.
 */


public class E5 {
	public static void main(String[] args) {
		ArrayList<String> countries= new ArrayList<String>(Arrays.asList("Colombia","Argentina","Uruguay","Ecuador"));
		LinkedList<String> countriesCopy=new LinkedList<String>(countries);
		
		for (int i = 0; i < countries.size(); i++) {
			System.out.println("The country in the ArrayList is: "+countries.get(i));
			System.out.println("The country in the LinkedList is: "+countriesCopy.get(i));

		}
	}
}
