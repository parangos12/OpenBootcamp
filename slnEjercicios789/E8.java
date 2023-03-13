package slnEjercicios789;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
 *  La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 *
 */
public class E8 {
	public static void main(String[] args) {
		copying("FILEIN.txt", "FILEOUTE.txt");
	}
	
	public static void copying(String fileIn,String fileOut) {
		try {
				InputStream inp=new FileInputStream("C:\\Users\\USER\\Desktop\\Programación\\JAVA\\JAVAWorkSpace\\CourseJavaBasicOB\\"+fileIn);
				byte[] datos=inp.readAllBytes();
				PrintStream out=new PrintStream("C:\\Users\\USER\\Desktop\\Programación\\JAVA\\JAVAWorkSpace\\CourseJavaBasicOB\\"+fileOut);
				out.write(datos);
				out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
