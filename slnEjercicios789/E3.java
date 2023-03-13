package slnEjercicios789;

import java.util.Vector;

public class E3 {

	public static void main(String[] args) {
		Vector<String> names=new Vector<String>();
		names.add("Pedro");
		names.add("Jesús");
		names.add("Maria");
		names.add("Jose");
		names.add("Socorro");
		
		names.remove("Jesús");
		names.remove("Maria");
		
		System.out.println(names);
	} 

}
