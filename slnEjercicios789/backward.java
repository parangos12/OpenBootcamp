package slnEjercicios789;

public class backward {

	public static void main(String[] args) {
		String word="pedro arango sanchez";
		System.out.println(backward(word));
		
	}
	
	public static String backward(String word) {
		String backward="";
		for (int i = word.length()-1; i >= 0; i--) {
			backward+=word.charAt(i);
		}
		return backward;
	}

}
