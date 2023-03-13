package slnEjercicios789;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo 
 * y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. 
 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 *
 */
public class E6 {

	public static void main(String[] args) {
		ArrayList<Integer> odds=new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			if (i%2!=0) {
				odds.add(i);
			}
		}
		for (Integer n : odds) {
			System.out.println(n);
		}
	}

}
