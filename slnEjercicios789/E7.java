package slnEjercicios789;
/**
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException 
 * que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, 
 * mostraremos el mensaje "Esto no puede hacerse". 
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 * @author Pedro
 *
 */
public class E7 {

	public static void main(String[] args) {
		try {
			double resultado=division(3,0);
			System.out.println(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static int division(int a,int b) throws Exception{
		
		if (b==0) {
			throw new Exception("Esto no puede hacerse");
		}else {
			return a/b;}
		
	}

}
